package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode(callSuper=false)
public final class SourceVerificationFlow extends StripeObject {
	Integer attemptsRemaining;
	String status;
}
