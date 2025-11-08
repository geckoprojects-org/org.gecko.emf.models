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

import java.math.BigDecimal;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.EvidenceTechnique;
import org.cyclonedx.schema.bom.MethodType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MethodTypeImpl#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MethodTypeImpl#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MethodTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodTypeImpl extends MinimalEObjectImpl.Container implements MethodType {
	/**
	 * The default value of the '{@link #getTechnique() <em>Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnique()
	 * @generated
	 * @ordered
	 */
	protected static final EvidenceTechnique TECHNIQUE_EDEFAULT = EvidenceTechnique.SOURCE_CODE_ANALYSIS;

	/**
	 * The cached value of the '{@link #getTechnique() <em>Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnique()
	 * @generated
	 * @ordered
	 */
	protected EvidenceTechnique technique = TECHNIQUE_EDEFAULT;

	/**
	 * This is true if the Technique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean techniqueESet;

	/**
	 * The default value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CONFIDENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal confidence = CONFIDENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getMethodType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceTechnique getTechnique() {
		return technique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechnique(EvidenceTechnique newTechnique) {
		EvidenceTechnique oldTechnique = technique;
		technique = newTechnique == null ? TECHNIQUE_EDEFAULT : newTechnique;
		boolean oldTechniqueESet = techniqueESet;
		techniqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.METHOD_TYPE__TECHNIQUE, oldTechnique, technique, !oldTechniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTechnique() {
		EvidenceTechnique oldTechnique = technique;
		boolean oldTechniqueESet = techniqueESet;
		technique = TECHNIQUE_EDEFAULT;
		techniqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.METHOD_TYPE__TECHNIQUE, oldTechnique, TECHNIQUE_EDEFAULT, oldTechniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTechnique() {
		return techniqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getConfidence() {
		return confidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfidence(BigDecimal newConfidence) {
		BigDecimal oldConfidence = confidence;
		confidence = newConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.METHOD_TYPE__CONFIDENCE, oldConfidence, confidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.METHOD_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.METHOD_TYPE__TECHNIQUE:
				return getTechnique();
			case BOMPackage.METHOD_TYPE__CONFIDENCE:
				return getConfidence();
			case BOMPackage.METHOD_TYPE__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BOMPackage.METHOD_TYPE__TECHNIQUE:
				setTechnique((EvidenceTechnique)newValue);
				return;
			case BOMPackage.METHOD_TYPE__CONFIDENCE:
				setConfidence((BigDecimal)newValue);
				return;
			case BOMPackage.METHOD_TYPE__VALUE:
				setValue((String)newValue);
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
			case BOMPackage.METHOD_TYPE__TECHNIQUE:
				unsetTechnique();
				return;
			case BOMPackage.METHOD_TYPE__CONFIDENCE:
				setConfidence(CONFIDENCE_EDEFAULT);
				return;
			case BOMPackage.METHOD_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case BOMPackage.METHOD_TYPE__TECHNIQUE:
				return isSetTechnique();
			case BOMPackage.METHOD_TYPE__CONFIDENCE:
				return CONFIDENCE_EDEFAULT == null ? confidence != null : !CONFIDENCE_EDEFAULT.equals(confidence);
			case BOMPackage.METHOD_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (technique: ");
		if (techniqueESet) result.append(technique); else result.append("<unset>");
		result.append(", confidence: ");
		result.append(confidence);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //MethodTypeImpl
