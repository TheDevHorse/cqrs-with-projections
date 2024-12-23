package com.thedevhorse.cqrswithprojections.command;

import com.thedevhorse.cqrswithprojections.domain.Status;

public record OrderRequest(Long number, Status status) {
}
