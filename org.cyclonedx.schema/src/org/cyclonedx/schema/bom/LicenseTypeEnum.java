/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.cyclonedx.schema.bom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>License Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseTypeEnum()
 * @model extendedMetaData="name='licenseTypeEnum'"
 * @generated
 */
@ProviderType
public enum LicenseTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Academic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license that grants use of software solely for the purpose
	 *                         of education or research.
	 * <!-- end-model-doc -->
	 * @see #ACADEMIC_VALUE
	 * @generated
	 * @ordered
	 */
	ACADEMIC(0, "academic", "academic"),

	/**
	 * The '<em><b>Appliance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license covering use of software embedded in a specific
	 *                         piece of hardware.
	 * <!-- end-model-doc -->
	 * @see #APPLIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	APPLIANCE(1, "appliance", "appliance"),

	/**
	 * The '<em><b>Client Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Client Access License (CAL) allows client computers to access
	 *                         services provided by server software.
	 * <!-- end-model-doc -->
	 * @see #CLIENT_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT_ACCESS(2, "clientAccess", "client-access"),

	/**
	 * The '<em><b>Concurrent User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Concurrent User license (aka floating license) limits the
	 *                         number of licenses for a software application and licenses are shared among
	 *                         a larger number of users.
	 * <!-- end-model-doc -->
	 * @see #CONCURRENT_USER_VALUE
	 * @generated
	 * @ordered
	 */
	CONCURRENT_USER(3, "concurrentUser", "concurrent-user"),

	/**
	 * The '<em><b>Core Points</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license where the core of a computer's processor is assigned
	 *                         a specific number of points.
	 * <!-- end-model-doc -->
	 * @see #CORE_POINTS_VALUE
	 * @generated
	 * @ordered
	 */
	CORE_POINTS(4, "corePoints", "core-points"),

	/**
	 * The '<em><b>Custom Metric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license for which consumption is measured by non-standard
	 *                         metrics.
	 * <!-- end-model-doc -->
	 * @see #CUSTOM_METRIC_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM_METRIC(5, "customMetric", "custom-metric"),

	/**
	 * The '<em><b>Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license that covers a defined number of installations on
	 *                         computers and other types of devices.
	 * <!-- end-model-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(6, "device", "device"),

	/**
	 * The '<em><b>Evaluation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license that grants permission to install and use software
	 *                         for trial purposes.
	 * <!-- end-model-doc -->
	 * @see #EVALUATION_VALUE
	 * @generated
	 * @ordered
	 */
	EVALUATION(7, "evaluation", "evaluation"),

	/**
	 * The '<em><b>Named User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license that grants access to the software to one or more
	 *                         pre-defined users.
	 * <!-- end-model-doc -->
	 * @see #NAMED_USER_VALUE
	 * @generated
	 * @ordered
	 */
	NAMED_USER(8, "namedUser", "named-user"),

	/**
	 * The '<em><b>Node Locked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license that grants access to the software on one or more
	 *                         pre-defined computers or devices.
	 * <!-- end-model-doc -->
	 * @see #NODE_LOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	NODE_LOCKED(9, "nodeLocked", "node-locked"),

	/**
	 * The '<em><b>Oem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Original Equipment Manufacturer license that is delivered
	 *                         with hardware, cannot be transferred to other hardware, and is valid for the
	 *                         life of the hardware.
	 * <!-- end-model-doc -->
	 * @see #OEM_VALUE
	 * @generated
	 * @ordered
	 */
	OEM(10, "oem", "oem"),

	/**
	 * The '<em><b>Perpetual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license where the software is sold on a one-time basis and
	 *                         the licensee can use a copy of the software indefinitely.
	 * <!-- end-model-doc -->
	 * @see #PERPETUAL_VALUE
	 * @generated
	 * @ordered
	 */
	PERPETUAL(11, "perpetual", "perpetual"),

	/**
	 * The '<em><b>Processor Points</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license where each installation consumes points per
	 *                         processor.
	 * <!-- end-model-doc -->
	 * @see #PROCESSOR_POINTS_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSOR_POINTS(12, "processorPoints", "processor-points"),

	/**
	 * The '<em><b>Subscription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license where the licensee pays a fee to use the software
	 *                         or service.
	 * <!-- end-model-doc -->
	 * @see #SUBSCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIPTION(13, "subscription", "subscription"),

	/**
	 * The '<em><b>User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license that grants access to the software or service by a
	 *                         specified number of users.
	 * <!-- end-model-doc -->
	 * @see #USER_VALUE
	 * @generated
	 * @ordered
	 */
	USER(14, "user", "user"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Another license type.
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(15, "other", "other");

	/**
	 * The '<em><b>Academic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license that grants use of software solely for the purpose
	 *                         of education or research.
	 * <!-- end-model-doc -->
	 * @see #ACADEMIC
	 * @model name="academic"
	 * @generated
	 * @ordered
	 */
	public static final int ACADEMIC_VALUE = 0;

	/**
	 * The '<em><b>Appliance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license covering use of software embedded in a specific
	 *                         piece of hardware.
	 * <!-- end-model-doc -->
	 * @see #APPLIANCE
	 * @model name="appliance"
	 * @generated
	 * @ordered
	 */
	public static final int APPLIANCE_VALUE = 1;

	/**
	 * The '<em><b>Client Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Client Access License (CAL) allows client computers to access
	 *                         services provided by server software.
	 * <!-- end-model-doc -->
	 * @see #CLIENT_ACCESS
	 * @model name="clientAccess" literal="client-access"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_ACCESS_VALUE = 2;

	/**
	 * The '<em><b>Concurrent User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Concurrent User license (aka floating license) limits the
	 *                         number of licenses for a software application and licenses are shared among
	 *                         a larger number of users.
	 * <!-- end-model-doc -->
	 * @see #CONCURRENT_USER
	 * @model name="concurrentUser" literal="concurrent-user"
	 * @generated
	 * @ordered
	 */
	public static final int CONCURRENT_USER_VALUE = 3;

	/**
	 * The '<em><b>Core Points</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license where the core of a computer's processor is assigned
	 *                         a specific number of points.
	 * <!-- end-model-doc -->
	 * @see #CORE_POINTS
	 * @model name="corePoints" literal="core-points"
	 * @generated
	 * @ordered
	 */
	public static final int CORE_POINTS_VALUE = 4;

	/**
	 * The '<em><b>Custom Metric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license for which consumption is measured by non-standard
	 *                         metrics.
	 * <!-- end-model-doc -->
	 * @see #CUSTOM_METRIC
	 * @model name="customMetric" literal="custom-metric"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_METRIC_VALUE = 5;

	/**
	 * The '<em><b>Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license that covers a defined number of installations on
	 *                         computers and other types of devices.
	 * <!-- end-model-doc -->
	 * @see #DEVICE
	 * @model name="device"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 6;

	/**
	 * The '<em><b>Evaluation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license that grants permission to install and use software
	 *                         for trial purposes.
	 * <!-- end-model-doc -->
	 * @see #EVALUATION
	 * @model name="evaluation"
	 * @generated
	 * @ordered
	 */
	public static final int EVALUATION_VALUE = 7;

	/**
	 * The '<em><b>Named User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license that grants access to the software to one or more
	 *                         pre-defined users.
	 * <!-- end-model-doc -->
	 * @see #NAMED_USER
	 * @model name="namedUser" literal="named-user"
	 * @generated
	 * @ordered
	 */
	public static final int NAMED_USER_VALUE = 8;

	/**
	 * The '<em><b>Node Locked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license that grants access to the software on one or more
	 *                         pre-defined computers or devices.
	 * <!-- end-model-doc -->
	 * @see #NODE_LOCKED
	 * @model name="nodeLocked" literal="node-locked"
	 * @generated
	 * @ordered
	 */
	public static final int NODE_LOCKED_VALUE = 9;

	/**
	 * The '<em><b>Oem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Original Equipment Manufacturer license that is delivered
	 *                         with hardware, cannot be transferred to other hardware, and is valid for the
	 *                         life of the hardware.
	 * <!-- end-model-doc -->
	 * @see #OEM
	 * @model name="oem"
	 * @generated
	 * @ordered
	 */
	public static final int OEM_VALUE = 10;

	/**
	 * The '<em><b>Perpetual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license where the software is sold on a one-time basis and
	 *                         the licensee can use a copy of the software indefinitely.
	 * <!-- end-model-doc -->
	 * @see #PERPETUAL
	 * @model name="perpetual"
	 * @generated
	 * @ordered
	 */
	public static final int PERPETUAL_VALUE = 11;

	/**
	 * The '<em><b>Processor Points</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license where each installation consumes points per
	 *                         processor.
	 * <!-- end-model-doc -->
	 * @see #PROCESSOR_POINTS
	 * @model name="processorPoints" literal="processor-points"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSOR_POINTS_VALUE = 12;

	/**
	 * The '<em><b>Subscription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license where the licensee pays a fee to use the software
	 *                         or service.
	 * <!-- end-model-doc -->
	 * @see #SUBSCRIPTION
	 * @model name="subscription"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPTION_VALUE = 13;

	/**
	 * The '<em><b>User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A license that grants access to the software or service by a
	 *                         specified number of users.
	 * <!-- end-model-doc -->
	 * @see #USER
	 * @model name="user"
	 * @generated
	 * @ordered
	 */
	public static final int USER_VALUE = 14;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Another license type.
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 15;

	/**
	 * An array of all the '<em><b>License Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LicenseTypeEnum[] VALUES_ARRAY =
		new LicenseTypeEnum[] {
			ACADEMIC,
			APPLIANCE,
			CLIENT_ACCESS,
			CONCURRENT_USER,
			CORE_POINTS,
			CUSTOM_METRIC,
			DEVICE,
			EVALUATION,
			NAMED_USER,
			NODE_LOCKED,
			OEM,
			PERPETUAL,
			PROCESSOR_POINTS,
			SUBSCRIPTION,
			USER,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>License Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LicenseTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>License Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LicenseTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LicenseTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>License Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LicenseTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LicenseTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>License Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LicenseTypeEnum get(int value) {
		switch (value) {
			case ACADEMIC_VALUE: return ACADEMIC;
			case APPLIANCE_VALUE: return APPLIANCE;
			case CLIENT_ACCESS_VALUE: return CLIENT_ACCESS;
			case CONCURRENT_USER_VALUE: return CONCURRENT_USER;
			case CORE_POINTS_VALUE: return CORE_POINTS;
			case CUSTOM_METRIC_VALUE: return CUSTOM_METRIC;
			case DEVICE_VALUE: return DEVICE;
			case EVALUATION_VALUE: return EVALUATION;
			case NAMED_USER_VALUE: return NAMED_USER;
			case NODE_LOCKED_VALUE: return NODE_LOCKED;
			case OEM_VALUE: return OEM;
			case PERPETUAL_VALUE: return PERPETUAL;
			case PROCESSOR_POINTS_VALUE: return PROCESSOR_POINTS;
			case SUBSCRIPTION_VALUE: return SUBSCRIPTION;
			case USER_VALUE: return USER;
			case OTHER_VALUE: return OTHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LicenseTypeEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //LicenseTypeEnum
