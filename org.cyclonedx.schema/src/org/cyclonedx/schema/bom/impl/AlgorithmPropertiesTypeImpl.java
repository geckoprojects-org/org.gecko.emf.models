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
package org.cyclonedx.schema.bom.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.cyclonedx.schema.bom.AlgorithmPropertiesType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.CertificationLevelType;
import org.cyclonedx.schema.bom.CryptoFunctionsType;
import org.cyclonedx.schema.bom.ExecutionEnvironmentType;
import org.cyclonedx.schema.bom.ImplementationPlatformType;
import org.cyclonedx.schema.bom.ModeType;
import org.cyclonedx.schema.bom.PaddingType;
import org.cyclonedx.schema.bom.PrimitiveType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithm Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AlgorithmPropertiesTypeImpl#getPrimitive <em>Primitive</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AlgorithmPropertiesTypeImpl#getParameterSetIdentifier <em>Parameter Set Identifier</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AlgorithmPropertiesTypeImpl#getCurve <em>Curve</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AlgorithmPropertiesTypeImpl#getExecutionEnvironment <em>Execution Environment</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AlgorithmPropertiesTypeImpl#getImplementationPlatform <em>Implementation Platform</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AlgorithmPropertiesTypeImpl#getCertificationLevel <em>Certification Level</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AlgorithmPropertiesTypeImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AlgorithmPropertiesTypeImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AlgorithmPropertiesTypeImpl#getCryptoFunctions <em>Crypto Functions</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AlgorithmPropertiesTypeImpl#getClassicalSecurityLevel <em>Classical Security Level</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AlgorithmPropertiesTypeImpl#getNistQuantumSecurityLevel <em>Nist Quantum Security Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgorithmPropertiesTypeImpl extends MinimalEObjectImpl.Container implements AlgorithmPropertiesType {
	/**
	 * The default value of the '{@link #getPrimitive() <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitive()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveType PRIMITIVE_EDEFAULT = PrimitiveType.DRBG;

	/**
	 * The cached value of the '{@link #getPrimitive() <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitive()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType primitive = PRIMITIVE_EDEFAULT;

	/**
	 * This is true if the Primitive attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean primitiveESet;

	/**
	 * The default value of the '{@link #getParameterSetIdentifier() <em>Parameter Set Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSetIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_SET_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterSetIdentifier() <em>Parameter Set Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSetIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String parameterSetIdentifier = PARAMETER_SET_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurve() <em>Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurve()
	 * @generated
	 * @ordered
	 */
	protected static final String CURVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurve() <em>Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurve()
	 * @generated
	 * @ordered
	 */
	protected String curve = CURVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionEnvironment() <em>Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutionEnvironmentType EXECUTION_ENVIRONMENT_EDEFAULT = ExecutionEnvironmentType.SOFTWARE_PLAIN_RAM;

	/**
	 * The cached value of the '{@link #getExecutionEnvironment() <em>Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected ExecutionEnvironmentType executionEnvironment = EXECUTION_ENVIRONMENT_EDEFAULT;

	/**
	 * This is true if the Execution Environment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean executionEnvironmentESet;

	/**
	 * The default value of the '{@link #getImplementationPlatform() <em>Implementation Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationPlatform()
	 * @generated
	 * @ordered
	 */
	protected static final ImplementationPlatformType IMPLEMENTATION_PLATFORM_EDEFAULT = ImplementationPlatformType.GENERIC;

	/**
	 * The cached value of the '{@link #getImplementationPlatform() <em>Implementation Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationPlatform()
	 * @generated
	 * @ordered
	 */
	protected ImplementationPlatformType implementationPlatform = IMPLEMENTATION_PLATFORM_EDEFAULT;

	/**
	 * This is true if the Implementation Platform attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean implementationPlatformESet;

	/**
	 * The cached value of the '{@link #getCertificationLevel() <em>Certification Level</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificationLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<CertificationLevelType> certificationLevel;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ModeType MODE_EDEFAULT = ModeType.CBC;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ModeType mode = MODE_EDEFAULT;

	/**
	 * This is true if the Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeESet;

	/**
	 * The default value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected static final PaddingType PADDING_EDEFAULT = PaddingType.PKCS5;

	/**
	 * The cached value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected PaddingType padding = PADDING_EDEFAULT;

	/**
	 * This is true if the Padding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean paddingESet;

	/**
	 * The cached value of the '{@link #getCryptoFunctions() <em>Crypto Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCryptoFunctions()
	 * @generated
	 * @ordered
	 */
	protected CryptoFunctionsType cryptoFunctions;

	/**
	 * The default value of the '{@link #getClassicalSecurityLevel() <em>Classical Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassicalSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CLASSICAL_SECURITY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassicalSecurityLevel() <em>Classical Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassicalSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger classicalSecurityLevel = CLASSICAL_SECURITY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNistQuantumSecurityLevel() <em>Nist Quantum Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNistQuantumSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NIST_QUANTUM_SECURITY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNistQuantumSecurityLevel() <em>Nist Quantum Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNistQuantumSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger nistQuantumSecurityLevel = NIST_QUANTUM_SECURITY_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getAlgorithmPropertiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType getPrimitive() {
		return primitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimitive(PrimitiveType newPrimitive) {
		PrimitiveType oldPrimitive = primitive;
		primitive = newPrimitive == null ? PRIMITIVE_EDEFAULT : newPrimitive;
		boolean oldPrimitiveESet = primitiveESet;
		primitiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__PRIMITIVE, oldPrimitive, primitive, !oldPrimitiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPrimitive() {
		PrimitiveType oldPrimitive = primitive;
		boolean oldPrimitiveESet = primitiveESet;
		primitive = PRIMITIVE_EDEFAULT;
		primitiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__PRIMITIVE, oldPrimitive, PRIMITIVE_EDEFAULT, oldPrimitiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPrimitive() {
		return primitiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameterSetIdentifier() {
		return parameterSetIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterSetIdentifier(String newParameterSetIdentifier) {
		String oldParameterSetIdentifier = parameterSetIdentifier;
		parameterSetIdentifier = newParameterSetIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__PARAMETER_SET_IDENTIFIER, oldParameterSetIdentifier, parameterSetIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurve() {
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurve(String newCurve) {
		String oldCurve = curve;
		curve = newCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__CURVE, oldCurve, curve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionEnvironmentType getExecutionEnvironment() {
		return executionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionEnvironment(ExecutionEnvironmentType newExecutionEnvironment) {
		ExecutionEnvironmentType oldExecutionEnvironment = executionEnvironment;
		executionEnvironment = newExecutionEnvironment == null ? EXECUTION_ENVIRONMENT_EDEFAULT : newExecutionEnvironment;
		boolean oldExecutionEnvironmentESet = executionEnvironmentESet;
		executionEnvironmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__EXECUTION_ENVIRONMENT, oldExecutionEnvironment, executionEnvironment, !oldExecutionEnvironmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetExecutionEnvironment() {
		ExecutionEnvironmentType oldExecutionEnvironment = executionEnvironment;
		boolean oldExecutionEnvironmentESet = executionEnvironmentESet;
		executionEnvironment = EXECUTION_ENVIRONMENT_EDEFAULT;
		executionEnvironmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__EXECUTION_ENVIRONMENT, oldExecutionEnvironment, EXECUTION_ENVIRONMENT_EDEFAULT, oldExecutionEnvironmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetExecutionEnvironment() {
		return executionEnvironmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationPlatformType getImplementationPlatform() {
		return implementationPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementationPlatform(ImplementationPlatformType newImplementationPlatform) {
		ImplementationPlatformType oldImplementationPlatform = implementationPlatform;
		implementationPlatform = newImplementationPlatform == null ? IMPLEMENTATION_PLATFORM_EDEFAULT : newImplementationPlatform;
		boolean oldImplementationPlatformESet = implementationPlatformESet;
		implementationPlatformESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__IMPLEMENTATION_PLATFORM, oldImplementationPlatform, implementationPlatform, !oldImplementationPlatformESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetImplementationPlatform() {
		ImplementationPlatformType oldImplementationPlatform = implementationPlatform;
		boolean oldImplementationPlatformESet = implementationPlatformESet;
		implementationPlatform = IMPLEMENTATION_PLATFORM_EDEFAULT;
		implementationPlatformESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__IMPLEMENTATION_PLATFORM, oldImplementationPlatform, IMPLEMENTATION_PLATFORM_EDEFAULT, oldImplementationPlatformESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetImplementationPlatform() {
		return implementationPlatformESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CertificationLevelType> getCertificationLevel() {
		if (certificationLevel == null) {
			certificationLevel = new EDataTypeEList<CertificationLevelType>(CertificationLevelType.class, this, BOMPackage.ALGORITHM_PROPERTIES_TYPE__CERTIFICATION_LEVEL);
		}
		return certificationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeType getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(ModeType newMode) {
		ModeType oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		boolean oldModeESet = modeESet;
		modeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__MODE, oldMode, mode, !oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMode() {
		ModeType oldMode = mode;
		boolean oldModeESet = modeESet;
		mode = MODE_EDEFAULT;
		modeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__MODE, oldMode, MODE_EDEFAULT, oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMode() {
		return modeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaddingType getPadding() {
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPadding(PaddingType newPadding) {
		PaddingType oldPadding = padding;
		padding = newPadding == null ? PADDING_EDEFAULT : newPadding;
		boolean oldPaddingESet = paddingESet;
		paddingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__PADDING, oldPadding, padding, !oldPaddingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPadding() {
		PaddingType oldPadding = padding;
		boolean oldPaddingESet = paddingESet;
		padding = PADDING_EDEFAULT;
		paddingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__PADDING, oldPadding, PADDING_EDEFAULT, oldPaddingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPadding() {
		return paddingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CryptoFunctionsType getCryptoFunctions() {
		return cryptoFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCryptoFunctions(CryptoFunctionsType newCryptoFunctions, NotificationChain msgs) {
		CryptoFunctionsType oldCryptoFunctions = cryptoFunctions;
		cryptoFunctions = newCryptoFunctions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__CRYPTO_FUNCTIONS, oldCryptoFunctions, newCryptoFunctions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCryptoFunctions(CryptoFunctionsType newCryptoFunctions) {
		if (newCryptoFunctions != cryptoFunctions) {
			NotificationChain msgs = null;
			if (cryptoFunctions != null)
				msgs = ((InternalEObject)cryptoFunctions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ALGORITHM_PROPERTIES_TYPE__CRYPTO_FUNCTIONS, null, msgs);
			if (newCryptoFunctions != null)
				msgs = ((InternalEObject)newCryptoFunctions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ALGORITHM_PROPERTIES_TYPE__CRYPTO_FUNCTIONS, null, msgs);
			msgs = basicSetCryptoFunctions(newCryptoFunctions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__CRYPTO_FUNCTIONS, newCryptoFunctions, newCryptoFunctions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getClassicalSecurityLevel() {
		return classicalSecurityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassicalSecurityLevel(BigInteger newClassicalSecurityLevel) {
		BigInteger oldClassicalSecurityLevel = classicalSecurityLevel;
		classicalSecurityLevel = newClassicalSecurityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__CLASSICAL_SECURITY_LEVEL, oldClassicalSecurityLevel, classicalSecurityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getNistQuantumSecurityLevel() {
		return nistQuantumSecurityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNistQuantumSecurityLevel(BigInteger newNistQuantumSecurityLevel) {
		BigInteger oldNistQuantumSecurityLevel = nistQuantumSecurityLevel;
		nistQuantumSecurityLevel = newNistQuantumSecurityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ALGORITHM_PROPERTIES_TYPE__NIST_QUANTUM_SECURITY_LEVEL, oldNistQuantumSecurityLevel, nistQuantumSecurityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CRYPTO_FUNCTIONS:
				return basicSetCryptoFunctions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__PRIMITIVE:
				return getPrimitive();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__PARAMETER_SET_IDENTIFIER:
				return getParameterSetIdentifier();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CURVE:
				return getCurve();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__EXECUTION_ENVIRONMENT:
				return getExecutionEnvironment();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__IMPLEMENTATION_PLATFORM:
				return getImplementationPlatform();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CERTIFICATION_LEVEL:
				return getCertificationLevel();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__MODE:
				return getMode();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__PADDING:
				return getPadding();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CRYPTO_FUNCTIONS:
				return getCryptoFunctions();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CLASSICAL_SECURITY_LEVEL:
				return getClassicalSecurityLevel();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__NIST_QUANTUM_SECURITY_LEVEL:
				return getNistQuantumSecurityLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__PRIMITIVE:
				setPrimitive((PrimitiveType)newValue);
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__PARAMETER_SET_IDENTIFIER:
				setParameterSetIdentifier((String)newValue);
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CURVE:
				setCurve((String)newValue);
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__EXECUTION_ENVIRONMENT:
				setExecutionEnvironment((ExecutionEnvironmentType)newValue);
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__IMPLEMENTATION_PLATFORM:
				setImplementationPlatform((ImplementationPlatformType)newValue);
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CERTIFICATION_LEVEL:
				getCertificationLevel().clear();
				getCertificationLevel().addAll((Collection<? extends CertificationLevelType>)newValue);
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__MODE:
				setMode((ModeType)newValue);
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__PADDING:
				setPadding((PaddingType)newValue);
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CRYPTO_FUNCTIONS:
				setCryptoFunctions((CryptoFunctionsType)newValue);
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CLASSICAL_SECURITY_LEVEL:
				setClassicalSecurityLevel((BigInteger)newValue);
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__NIST_QUANTUM_SECURITY_LEVEL:
				setNistQuantumSecurityLevel((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__PRIMITIVE:
				unsetPrimitive();
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__PARAMETER_SET_IDENTIFIER:
				setParameterSetIdentifier(PARAMETER_SET_IDENTIFIER_EDEFAULT);
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CURVE:
				setCurve(CURVE_EDEFAULT);
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__EXECUTION_ENVIRONMENT:
				unsetExecutionEnvironment();
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__IMPLEMENTATION_PLATFORM:
				unsetImplementationPlatform();
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CERTIFICATION_LEVEL:
				getCertificationLevel().clear();
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__MODE:
				unsetMode();
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__PADDING:
				unsetPadding();
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CRYPTO_FUNCTIONS:
				setCryptoFunctions((CryptoFunctionsType)null);
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CLASSICAL_SECURITY_LEVEL:
				setClassicalSecurityLevel(CLASSICAL_SECURITY_LEVEL_EDEFAULT);
				return;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__NIST_QUANTUM_SECURITY_LEVEL:
				setNistQuantumSecurityLevel(NIST_QUANTUM_SECURITY_LEVEL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__PRIMITIVE:
				return isSetPrimitive();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__PARAMETER_SET_IDENTIFIER:
				return PARAMETER_SET_IDENTIFIER_EDEFAULT == null ? parameterSetIdentifier != null : !PARAMETER_SET_IDENTIFIER_EDEFAULT.equals(parameterSetIdentifier);
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CURVE:
				return CURVE_EDEFAULT == null ? curve != null : !CURVE_EDEFAULT.equals(curve);
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__EXECUTION_ENVIRONMENT:
				return isSetExecutionEnvironment();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__IMPLEMENTATION_PLATFORM:
				return isSetImplementationPlatform();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CERTIFICATION_LEVEL:
				return certificationLevel != null && !certificationLevel.isEmpty();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__MODE:
				return isSetMode();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__PADDING:
				return isSetPadding();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CRYPTO_FUNCTIONS:
				return cryptoFunctions != null;
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__CLASSICAL_SECURITY_LEVEL:
				return CLASSICAL_SECURITY_LEVEL_EDEFAULT == null ? classicalSecurityLevel != null : !CLASSICAL_SECURITY_LEVEL_EDEFAULT.equals(classicalSecurityLevel);
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE__NIST_QUANTUM_SECURITY_LEVEL:
				return NIST_QUANTUM_SECURITY_LEVEL_EDEFAULT == null ? nistQuantumSecurityLevel != null : !NIST_QUANTUM_SECURITY_LEVEL_EDEFAULT.equals(nistQuantumSecurityLevel);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (primitive: ");
		if (primitiveESet) result.append(primitive); else result.append("<unset>");
		result.append(", parameterSetIdentifier: ");
		result.append(parameterSetIdentifier);
		result.append(", curve: ");
		result.append(curve);
		result.append(", executionEnvironment: ");
		if (executionEnvironmentESet) result.append(executionEnvironment); else result.append("<unset>");
		result.append(", implementationPlatform: ");
		if (implementationPlatformESet) result.append(implementationPlatform); else result.append("<unset>");
		result.append(", certificationLevel: ");
		result.append(certificationLevel);
		result.append(", mode: ");
		if (modeESet) result.append(mode); else result.append("<unset>");
		result.append(", padding: ");
		if (paddingESet) result.append(padding); else result.append("<unset>");
		result.append(", classicalSecurityLevel: ");
		result.append(classicalSecurityLevel);
		result.append(", nistQuantumSecurityLevel: ");
		result.append(nistQuantumSecurityLevel);
		result.append(')');
		return result.toString();
	}

} //AlgorithmPropertiesTypeImpl
