package com.easy.easybook.config;

public class ApiConfig {
    
    // OpenAI API Configuration
    // Replace with your actual OpenAI API key
    // You can get a free API key from: https://platform.openai.com/api-keys
    public static final String OPENAI_API_KEY = "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";
    public static final String OPENAI_API_URL = "https://api.openai.com/v1/chat/completions";
    
    // Model configuration
    public static final String MODEL_NAME = "gpt-3.5-turbo";
    public static final int MAX_TOKENS = 500;
    public static final double TEMPERATURE = 0.7;
}
