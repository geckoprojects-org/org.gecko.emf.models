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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithm Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getPrimitive <em>Primitive</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getParameterSetIdentifier <em>Parameter Set Identifier</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getCurve <em>Curve</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getExecutionEnvironment <em>Execution Environment</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getImplementationPlatform <em>Implementation Platform</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getCertificationLevel <em>Certification Level</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getMode <em>Mode</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getCryptoFunctions <em>Crypto Functions</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getClassicalSecurityLevel <em>Classical Security Level</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getNistQuantumSecurityLevel <em>Nist Quantum Security Level</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getAlgorithmPropertiesType()
 * @model extendedMetaData="name='algorithmProperties_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AlgorithmPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Primitive</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Cryptographic building blocks used in higher-level cryptographic systems and
	 *                                     protocols. Primitives represent different cryptographic routines: deterministic
	 *                                     random bit generators (drbg, e.g. CTR_DRBG from NIST SP800-90A-r1), message
	 *                                     authentication codes (mac, e.g. HMAC-SHA-256), blockciphers (e.g. AES),
	 *                                     streamciphers (e.g. Salsa20), signatures (e.g. ECDSA), hash functions (e.g. SHA-256),
	 *                                     public-key encryption schemes (pke, e.g. RSA), extended output functions
	 *                                     (xof, e.g. SHAKE256), key derivation functions (e.g. pbkdf2), key agreement
	 *                                     algorithms (e.g. ECDH), key encapsulation mechanisms (e.g. ML-KEM), authenticated
	 *                                     encryption (ae, e.g. AES-GCM) and the combination of multiple algorithms
	 *                                     (combiner, e.g. SP800-56Cr2).
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primitive</em>' attribute.
	 * @see org.cyclonedx.schema.bom.PrimitiveType
	 * @see #isSetPrimitive()
	 * @see #unsetPrimitive()
	 * @see #setPrimitive(PrimitiveType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAlgorithmPropertiesType_Primitive()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='primitive' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimitiveType getPrimitive();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getPrimitive <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive</em>' attribute.
	 * @see org.cyclonedx.schema.bom.PrimitiveType
	 * @see #isSetPrimitive()
	 * @see #unsetPrimitive()
	 * @see #getPrimitive()
	 * @generated
	 */
	void setPrimitive(PrimitiveType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getPrimitive <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrimitive()
	 * @see #getPrimitive()
	 * @see #setPrimitive(PrimitiveType)
	 * @generated
	 */
	void unsetPrimitive();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getPrimitive <em>Primitive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Primitive</em>' attribute is set.
	 * @see #unsetPrimitive()
	 * @see #getPrimitive()
	 * @see #setPrimitive(PrimitiveType)
	 * @generated
	 */
	boolean isSetPrimitive();

	/**
	 * Returns the value of the '<em><b>Parameter Set Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     An identifier for the parameter set of the cryptographic algorithm. Examples: in
	 *                                     AES128, '128' identifies the key length in bits, in SHA256, '256' identifies the
	 *                                     digest length, '128' in SHAKE128 identifies its maximum security level in bits, and
	 *                                     'SHA2-128s' identifies a parameter set used in SLH-DSA (FIPS205).
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Set Identifier</em>' attribute.
	 * @see #setParameterSetIdentifier(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAlgorithmPropertiesType_ParameterSetIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='parameterSetIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getParameterSetIdentifier();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getParameterSetIdentifier <em>Parameter Set Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Set Identifier</em>' attribute.
	 * @see #getParameterSetIdentifier()
	 * @generated
	 */
	void setParameterSetIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Curve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The specific underlying Elliptic Curve (EC) definition employed which is an indicator
	 *                                     of the level of security strength, performance and complexity. Absent an
	 *                                     authoritative source of curve names, CycloneDX recommends use of curve names as
	 *                                     defined at https://neuromancer.sk/std/, the source from which can be found at
	 *                                     https://github.com/J08nY/std-curves.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Curve</em>' attribute.
	 * @see #setCurve(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAlgorithmPropertiesType_Curve()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='curve' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCurve();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getCurve <em>Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve</em>' attribute.
	 * @see #getCurve()
	 * @generated
	 */
	void setCurve(String value);

	/**
	 * Returns the value of the '<em><b>Execution Environment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.ExecutionEnvironmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The target and execution environment in which the algorithm is implemented in.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Environment</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ExecutionEnvironmentType
	 * @see #isSetExecutionEnvironment()
	 * @see #unsetExecutionEnvironment()
	 * @see #setExecutionEnvironment(ExecutionEnvironmentType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAlgorithmPropertiesType_ExecutionEnvironment()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='executionEnvironment' namespace='##targetNamespace'"
	 * @generated
	 */
	ExecutionEnvironmentType getExecutionEnvironment();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getExecutionEnvironment <em>Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Environment</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ExecutionEnvironmentType
	 * @see #isSetExecutionEnvironment()
	 * @see #unsetExecutionEnvironment()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	void setExecutionEnvironment(ExecutionEnvironmentType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getExecutionEnvironment <em>Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExecutionEnvironment()
	 * @see #getExecutionEnvironment()
	 * @see #setExecutionEnvironment(ExecutionEnvironmentType)
	 * @generated
	 */
	void unsetExecutionEnvironment();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getExecutionEnvironment <em>Execution Environment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Execution Environment</em>' attribute is set.
	 * @see #unsetExecutionEnvironment()
	 * @see #getExecutionEnvironment()
	 * @see #setExecutionEnvironment(ExecutionEnvironmentType)
	 * @generated
	 */
	boolean isSetExecutionEnvironment();

	/**
	 * Returns the value of the '<em><b>Implementation Platform</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.ImplementationPlatformType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The target platform for which the algorithm is implemented. The implementation can
	 *                                     be 'generic', running on any platform or for a specific platform.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Platform</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ImplementationPlatformType
	 * @see #isSetImplementationPlatform()
	 * @see #unsetImplementationPlatform()
	 * @see #setImplementationPlatform(ImplementationPlatformType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAlgorithmPropertiesType_ImplementationPlatform()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='implementationPlatform' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplementationPlatformType getImplementationPlatform();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getImplementationPlatform <em>Implementation Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Platform</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ImplementationPlatformType
	 * @see #isSetImplementationPlatform()
	 * @see #unsetImplementationPlatform()
	 * @see #getImplementationPlatform()
	 * @generated
	 */
	void setImplementationPlatform(ImplementationPlatformType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getImplementationPlatform <em>Implementation Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImplementationPlatform()
	 * @see #getImplementationPlatform()
	 * @see #setImplementationPlatform(ImplementationPlatformType)
	 * @generated
	 */
	void unsetImplementationPlatform();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getImplementationPlatform <em>Implementation Platform</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Implementation Platform</em>' attribute is set.
	 * @see #unsetImplementationPlatform()
	 * @see #getImplementationPlatform()
	 * @see #setImplementationPlatform(ImplementationPlatformType)
	 * @generated
	 */
	boolean isSetImplementationPlatform();

	/**
	 * Returns the value of the '<em><b>Certification Level</b></em>' attribute list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.CertificationLevelType}.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.CertificationLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The certification that the implementation of the cryptographic algorithm has
	 *                                     received, if any. Certifications include revisions and levels of FIPS 140 or
	 *                                     Common Criteria of different Extended Assurance Levels (CC-EAL).
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certification Level</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.CertificationLevelType
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAlgorithmPropertiesType_CertificationLevel()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='certificationLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CertificationLevelType> getCertificationLevel();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.ModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The mode of operation in which the cryptographic algorithm (block cipher) is used.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ModeType
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(ModeType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAlgorithmPropertiesType_Mode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	ModeType getMode();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ModeType
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ModeType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(ModeType)
	 * @generated
	 */
	void unsetMode();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(ModeType)
	 * @generated
	 */
	boolean isSetMode();

	/**
	 * Returns the value of the '<em><b>Padding</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.PaddingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The padding scheme that is used for the cryptographic algorithm.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Padding</em>' attribute.
	 * @see org.cyclonedx.schema.bom.PaddingType
	 * @see #isSetPadding()
	 * @see #unsetPadding()
	 * @see #setPadding(PaddingType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAlgorithmPropertiesType_Padding()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='padding' namespace='##targetNamespace'"
	 * @generated
	 */
	PaddingType getPadding();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getPadding <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding</em>' attribute.
	 * @see org.cyclonedx.schema.bom.PaddingType
	 * @see #isSetPadding()
	 * @see #unsetPadding()
	 * @see #getPadding()
	 * @generated
	 */
	void setPadding(PaddingType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getPadding <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPadding()
	 * @see #getPadding()
	 * @see #setPadding(PaddingType)
	 * @generated
	 */
	void unsetPadding();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getPadding <em>Padding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Padding</em>' attribute is set.
	 * @see #unsetPadding()
	 * @see #getPadding()
	 * @see #setPadding(PaddingType)
	 * @generated
	 */
	boolean isSetPadding();

	/**
	 * Returns the value of the '<em><b>Crypto Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The cryptographic functions implemented by the cryptographic algorithm.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crypto Functions</em>' containment reference.
	 * @see #setCryptoFunctions(CryptoFunctionsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAlgorithmPropertiesType_CryptoFunctions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cryptoFunctions' namespace='##targetNamespace'"
	 * @generated
	 */
	CryptoFunctionsType getCryptoFunctions();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getCryptoFunctions <em>Crypto Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crypto Functions</em>' containment reference.
	 * @see #getCryptoFunctions()
	 * @generated
	 */
	void setCryptoFunctions(CryptoFunctionsType value);

	/**
	 * Returns the value of the '<em><b>Classical Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The classical security level that a cryptographic algorithm provides (in bits).
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classical Security Level</em>' attribute.
	 * @see #setClassicalSecurityLevel(BigInteger)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAlgorithmPropertiesType_ClassicalSecurityLevel()
	 * @model dataType="org.cyclonedx.schema.bom.ClassicalSecurityLevelType"
	 *        extendedMetaData="kind='element' name='classicalSecurityLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getClassicalSecurityLevel();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getClassicalSecurityLevel <em>Classical Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classical Security Level</em>' attribute.
	 * @see #getClassicalSecurityLevel()
	 * @generated
	 */
	void setClassicalSecurityLevel(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Nist Quantum Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The NIST security strength category as defined in
	 *                                     https://csrc.nist.gov/projects/post-quantum-cryptography/post-quantum-cryptography-standardization/evaluation-criteria/security-(evaluation-criteria).
	 *                                     A value of 0 indicates that none of the categories are met.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nist Quantum Security Level</em>' attribute.
	 * @see #setNistQuantumSecurityLevel(BigInteger)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAlgorithmPropertiesType_NistQuantumSecurityLevel()
	 * @model dataType="org.cyclonedx.schema.bom.NistQuantumSecurityLevelType"
	 *        extendedMetaData="kind='element' name='nistQuantumSecurityLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNistQuantumSecurityLevel();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType#getNistQuantumSecurityLevel <em>Nist Quantum Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nist Quantum Security Level</em>' attribute.
	 * @see #getNistQuantumSecurityLevel()
	 * @generated
	 */
	void setNistQuantumSecurityLevel(BigInteger value);

} // AlgorithmPropertiesType
