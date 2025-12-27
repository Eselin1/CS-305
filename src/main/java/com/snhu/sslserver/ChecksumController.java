package com.snhu.sslserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RestController
public class ChecksumController {

    @GetMapping("/hash")
    public String getChecksum() {
        String data = "Ian Repsher Check Sum!";
        return "Data: " + data + "\nChecksum (SHA-256): " + calculateChecksum(data);
    }

    private String calculateChecksum(String data) {
        try {
            // Create a SHA-256 digest
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            
            // Calculate the digest (hash)
            byte[] hash = digest.digest(data.getBytes("UTF-8"));
            
            // Convert byte array into a hex string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException | java.io.UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
}
