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
 * A representation of the literals of the enumeration '<em><b>Certification Level Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getCertificationLevelType()
 * @model extendedMetaData="name='certificationLevel_._type'"
 * @generated
 */
@ProviderType
public enum CertificationLevelType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 No certification obtained
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Fips1401 L1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-1 Level 1
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1401_L1_VALUE
	 * @generated
	 * @ordered
	 */
	FIPS1401_L1(1, "fips1401L1", "fips140-1-l1"),

	/**
	 * The '<em><b>Fips1401 L2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-1 Level 2
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1401_L2_VALUE
	 * @generated
	 * @ordered
	 */
	FIPS1401_L2(2, "fips1401L2", "fips140-1-l2"),

	/**
	 * The '<em><b>Fips1401 L3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-1 Level 3
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1401_L3_VALUE
	 * @generated
	 * @ordered
	 */
	FIPS1401_L3(3, "fips1401L3", "fips140-1-l3"),

	/**
	 * The '<em><b>Fips1401 L4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-1 Level 4
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1401_L4_VALUE
	 * @generated
	 * @ordered
	 */
	FIPS1401_L4(4, "fips1401L4", "fips140-1-l4"),

	/**
	 * The '<em><b>Fips1402 L1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-2 Level 1
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1402_L1_VALUE
	 * @generated
	 * @ordered
	 */
	FIPS1402_L1(5, "fips1402L1", "fips140-2-l1"),

	/**
	 * The '<em><b>Fips1402 L2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-2 Level 2
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1402_L2_VALUE
	 * @generated
	 * @ordered
	 */
	FIPS1402_L2(6, "fips1402L2", "fips140-2-l2"),

	/**
	 * The '<em><b>Fips1402 L3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-2 Level 3
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1402_L3_VALUE
	 * @generated
	 * @ordered
	 */
	FIPS1402_L3(7, "fips1402L3", "fips140-2-l3"),

	/**
	 * The '<em><b>Fips1402 L4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-2 Level 4
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1402_L4_VALUE
	 * @generated
	 * @ordered
	 */
	FIPS1402_L4(8, "fips1402L4", "fips140-2-l4"),

	/**
	 * The '<em><b>Fips1403 L1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-3 Level 1
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1403_L1_VALUE
	 * @generated
	 * @ordered
	 */
	FIPS1403_L1(9, "fips1403L1", "fips140-3-l1"),

	/**
	 * The '<em><b>Fips1403 L2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-3 Level 2
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1403_L2_VALUE
	 * @generated
	 * @ordered
	 */
	FIPS1403_L2(10, "fips1403L2", "fips140-3-l2"),

	/**
	 * The '<em><b>Fips1403 L3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-3 Level 3
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1403_L3_VALUE
	 * @generated
	 * @ordered
	 */
	FIPS1403_L3(11, "fips1403L3", "fips140-3-l3"),

	/**
	 * The '<em><b>Fips1403 L4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-3 Level 4
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1403_L4_VALUE
	 * @generated
	 * @ordered
	 */
	FIPS1403_L4(12, "fips1403L4", "fips140-3-l4"),

	/**
	 * The '<em><b>Cc Eal1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 1
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL1_VALUE
	 * @generated
	 * @ordered
	 */
	CC_EAL1(13, "ccEal1", "cc-eal1"),

	/**
	 * The '<em><b>Cc Eal11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 1 (Augmented)
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL11_VALUE
	 * @generated
	 * @ordered
	 */
	CC_EAL11(14, "ccEal11", "cc-eal1+"),

	/**
	 * The '<em><b>Cc Eal2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 2
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL2_VALUE
	 * @generated
	 * @ordered
	 */
	CC_EAL2(15, "ccEal2", "cc-eal2"),

	/**
	 * The '<em><b>Cc Eal21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 2 (Augmented)
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL21_VALUE
	 * @generated
	 * @ordered
	 */
	CC_EAL21(16, "ccEal21", "cc-eal2+"),

	/**
	 * The '<em><b>Cc Eal3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 3
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL3_VALUE
	 * @generated
	 * @ordered
	 */
	CC_EAL3(17, "ccEal3", "cc-eal3"),

	/**
	 * The '<em><b>Cc Eal31</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 3 (Augmented)
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL31_VALUE
	 * @generated
	 * @ordered
	 */
	CC_EAL31(18, "ccEal31", "cc-eal3+"),

	/**
	 * The '<em><b>Cc Eal4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 4
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL4_VALUE
	 * @generated
	 * @ordered
	 */
	CC_EAL4(19, "ccEal4", "cc-eal4"),

	/**
	 * The '<em><b>Cc Eal41</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 4 (Augmented)
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL41_VALUE
	 * @generated
	 * @ordered
	 */
	CC_EAL41(20, "ccEal41", "cc-eal4+"),

	/**
	 * The '<em><b>Cc Eal5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 5
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL5_VALUE
	 * @generated
	 * @ordered
	 */
	CC_EAL5(21, "ccEal5", "cc-eal5"),

	/**
	 * The '<em><b>Cc Eal51</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 5 (Augmented)
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL51_VALUE
	 * @generated
	 * @ordered
	 */
	CC_EAL51(22, "ccEal51", "cc-eal5+"),

	/**
	 * The '<em><b>Cc Eal6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 6
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL6_VALUE
	 * @generated
	 * @ordered
	 */
	CC_EAL6(23, "ccEal6", "cc-eal6"),

	/**
	 * The '<em><b>Cc Eal61</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 6 (Augmented)
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL61_VALUE
	 * @generated
	 * @ordered
	 */
	CC_EAL61(24, "ccEal61", "cc-eal6+"),

	/**
	 * The '<em><b>Cc Eal7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 7
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL7_VALUE
	 * @generated
	 * @ordered
	 */
	CC_EAL7(25, "ccEal7", "cc-eal7"),

	/**
	 * The '<em><b>Cc Eal71</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 7 (Augmented)
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL71_VALUE
	 * @generated
	 * @ordered
	 */
	CC_EAL71(26, "ccEal71", "cc-eal7+"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Another certification
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(27, "other", "other"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The certification level is not known
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(28, "unknown", "unknown");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 No certification obtained
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Fips1401 L1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-1 Level 1
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1401_L1
	 * @model name="fips1401L1" literal="fips140-1-l1"
	 * @generated
	 * @ordered
	 */
	public static final int FIPS1401_L1_VALUE = 1;

	/**
	 * The '<em><b>Fips1401 L2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-1 Level 2
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1401_L2
	 * @model name="fips1401L2" literal="fips140-1-l2"
	 * @generated
	 * @ordered
	 */
	public static final int FIPS1401_L2_VALUE = 2;

	/**
	 * The '<em><b>Fips1401 L3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-1 Level 3
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1401_L3
	 * @model name="fips1401L3" literal="fips140-1-l3"
	 * @generated
	 * @ordered
	 */
	public static final int FIPS1401_L3_VALUE = 3;

	/**
	 * The '<em><b>Fips1401 L4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-1 Level 4
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1401_L4
	 * @model name="fips1401L4" literal="fips140-1-l4"
	 * @generated
	 * @ordered
	 */
	public static final int FIPS1401_L4_VALUE = 4;

	/**
	 * The '<em><b>Fips1402 L1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-2 Level 1
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1402_L1
	 * @model name="fips1402L1" literal="fips140-2-l1"
	 * @generated
	 * @ordered
	 */
	public static final int FIPS1402_L1_VALUE = 5;

	/**
	 * The '<em><b>Fips1402 L2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-2 Level 2
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1402_L2
	 * @model name="fips1402L2" literal="fips140-2-l2"
	 * @generated
	 * @ordered
	 */
	public static final int FIPS1402_L2_VALUE = 6;

	/**
	 * The '<em><b>Fips1402 L3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-2 Level 3
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1402_L3
	 * @model name="fips1402L3" literal="fips140-2-l3"
	 * @generated
	 * @ordered
	 */
	public static final int FIPS1402_L3_VALUE = 7;

	/**
	 * The '<em><b>Fips1402 L4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-2 Level 4
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1402_L4
	 * @model name="fips1402L4" literal="fips140-2-l4"
	 * @generated
	 * @ordered
	 */
	public static final int FIPS1402_L4_VALUE = 8;

	/**
	 * The '<em><b>Fips1403 L1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-3 Level 1
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1403_L1
	 * @model name="fips1403L1" literal="fips140-3-l1"
	 * @generated
	 * @ordered
	 */
	public static final int FIPS1403_L1_VALUE = 9;

	/**
	 * The '<em><b>Fips1403 L2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-3 Level 2
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1403_L2
	 * @model name="fips1403L2" literal="fips140-3-l2"
	 * @generated
	 * @ordered
	 */
	public static final int FIPS1403_L2_VALUE = 10;

	/**
	 * The '<em><b>Fips1403 L3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-3 Level 3
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1403_L3
	 * @model name="fips1403L3" literal="fips140-3-l3"
	 * @generated
	 * @ordered
	 */
	public static final int FIPS1403_L3_VALUE = 11;

	/**
	 * The '<em><b>Fips1403 L4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 FIPS 140-3 Level 4
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #FIPS1403_L4
	 * @model name="fips1403L4" literal="fips140-3-l4"
	 * @generated
	 * @ordered
	 */
	public static final int FIPS1403_L4_VALUE = 12;

	/**
	 * The '<em><b>Cc Eal1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 1
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL1
	 * @model name="ccEal1" literal="cc-eal1"
	 * @generated
	 * @ordered
	 */
	public static final int CC_EAL1_VALUE = 13;

	/**
	 * The '<em><b>Cc Eal11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 1 (Augmented)
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL11
	 * @model name="ccEal11" literal="cc-eal1+"
	 * @generated
	 * @ordered
	 */
	public static final int CC_EAL11_VALUE = 14;

	/**
	 * The '<em><b>Cc Eal2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 2
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL2
	 * @model name="ccEal2" literal="cc-eal2"
	 * @generated
	 * @ordered
	 */
	public static final int CC_EAL2_VALUE = 15;

	/**
	 * The '<em><b>Cc Eal21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 2 (Augmented)
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL21
	 * @model name="ccEal21" literal="cc-eal2+"
	 * @generated
	 * @ordered
	 */
	public static final int CC_EAL21_VALUE = 16;

	/**
	 * The '<em><b>Cc Eal3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 3
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL3
	 * @model name="ccEal3" literal="cc-eal3"
	 * @generated
	 * @ordered
	 */
	public static final int CC_EAL3_VALUE = 17;

	/**
	 * The '<em><b>Cc Eal31</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 3 (Augmented)
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL31
	 * @model name="ccEal31" literal="cc-eal3+"
	 * @generated
	 * @ordered
	 */
	public static final int CC_EAL31_VALUE = 18;

	/**
	 * The '<em><b>Cc Eal4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 4
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL4
	 * @model name="ccEal4" literal="cc-eal4"
	 * @generated
	 * @ordered
	 */
	public static final int CC_EAL4_VALUE = 19;

	/**
	 * The '<em><b>Cc Eal41</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 4 (Augmented)
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL41
	 * @model name="ccEal41" literal="cc-eal4+"
	 * @generated
	 * @ordered
	 */
	public static final int CC_EAL41_VALUE = 20;

	/**
	 * The '<em><b>Cc Eal5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 5
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL5
	 * @model name="ccEal5" literal="cc-eal5"
	 * @generated
	 * @ordered
	 */
	public static final int CC_EAL5_VALUE = 21;

	/**
	 * The '<em><b>Cc Eal51</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 5 (Augmented)
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL51
	 * @model name="ccEal51" literal="cc-eal5+"
	 * @generated
	 * @ordered
	 */
	public static final int CC_EAL51_VALUE = 22;

	/**
	 * The '<em><b>Cc Eal6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 6
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL6
	 * @model name="ccEal6" literal="cc-eal6"
	 * @generated
	 * @ordered
	 */
	public static final int CC_EAL6_VALUE = 23;

	/**
	 * The '<em><b>Cc Eal61</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 6 (Augmented)
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL61
	 * @model name="ccEal61" literal="cc-eal6+"
	 * @generated
	 * @ordered
	 */
	public static final int CC_EAL61_VALUE = 24;

	/**
	 * The '<em><b>Cc Eal7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 7
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL7
	 * @model name="ccEal7" literal="cc-eal7"
	 * @generated
	 * @ordered
	 */
	public static final int CC_EAL7_VALUE = 25;

	/**
	 * The '<em><b>Cc Eal71</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Common Criteria - Evaluation Assurance Level 7 (Augmented)
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CC_EAL71
	 * @model name="ccEal71" literal="cc-eal7+"
	 * @generated
	 * @ordered
	 */
	public static final int CC_EAL71_VALUE = 26;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Another certification
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 27;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The certification level is not known
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 28;

	/**
	 * An array of all the '<em><b>Certification Level Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CertificationLevelType[] VALUES_ARRAY =
		new CertificationLevelType[] {
			NONE,
			FIPS1401_L1,
			FIPS1401_L2,
			FIPS1401_L3,
			FIPS1401_L4,
			FIPS1402_L1,
			FIPS1402_L2,
			FIPS1402_L3,
			FIPS1402_L4,
			FIPS1403_L1,
			FIPS1403_L2,
			FIPS1403_L3,
			FIPS1403_L4,
			CC_EAL1,
			CC_EAL11,
			CC_EAL2,
			CC_EAL21,
			CC_EAL3,
			CC_EAL31,
			CC_EAL4,
			CC_EAL41,
			CC_EAL5,
			CC_EAL51,
			CC_EAL6,
			CC_EAL61,
			CC_EAL7,
			CC_EAL71,
			OTHER,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Certification Level Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CertificationLevelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Certification Level Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CertificationLevelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CertificationLevelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Certification Level Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CertificationLevelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CertificationLevelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Certification Level Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CertificationLevelType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case FIPS1401_L1_VALUE: return FIPS1401_L1;
			case FIPS1401_L2_VALUE: return FIPS1401_L2;
			case FIPS1401_L3_VALUE: return FIPS1401_L3;
			case FIPS1401_L4_VALUE: return FIPS1401_L4;
			case FIPS1402_L1_VALUE: return FIPS1402_L1;
			case FIPS1402_L2_VALUE: return FIPS1402_L2;
			case FIPS1402_L3_VALUE: return FIPS1402_L3;
			case FIPS1402_L4_VALUE: return FIPS1402_L4;
			case FIPS1403_L1_VALUE: return FIPS1403_L1;
			case FIPS1403_L2_VALUE: return FIPS1403_L2;
			case FIPS1403_L3_VALUE: return FIPS1403_L3;
			case FIPS1403_L4_VALUE: return FIPS1403_L4;
			case CC_EAL1_VALUE: return CC_EAL1;
			case CC_EAL11_VALUE: return CC_EAL11;
			case CC_EAL2_VALUE: return CC_EAL2;
			case CC_EAL21_VALUE: return CC_EAL21;
			case CC_EAL3_VALUE: return CC_EAL3;
			case CC_EAL31_VALUE: return CC_EAL31;
			case CC_EAL4_VALUE: return CC_EAL4;
			case CC_EAL41_VALUE: return CC_EAL41;
			case CC_EAL5_VALUE: return CC_EAL5;
			case CC_EAL51_VALUE: return CC_EAL51;
			case CC_EAL6_VALUE: return CC_EAL6;
			case CC_EAL61_VALUE: return CC_EAL61;
			case CC_EAL7_VALUE: return CC_EAL7;
			case CC_EAL71_VALUE: return CC_EAL71;
			case OTHER_VALUE: return OTHER;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private CertificationLevelType(int value, String name, String literal) {
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
	
} //CertificationLevelType
