package com.example.spring_io_mcp;

import java.util.List;

public record Conference(
        String name,
        int year,
        String[] dates,
        String locations,
        List<Session> sessions
)
{}
