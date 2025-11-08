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

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.ConsiderationsType;
import org.cyclonedx.schema.bom.ModelCardType;
import org.cyclonedx.schema.bom.ModelParametersType;
import org.cyclonedx.schema.bom.QuantitativeAnalysisType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Card Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ModelCardTypeImpl#getModelParameters <em>Model Parameters</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ModelCardTypeImpl#getQuantitativeAnalysis <em>Quantitative Analysis</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ModelCardTypeImpl#getConsiderations <em>Considerations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ModelCardTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelCardTypeImpl extends MinimalEObjectImpl.Container implements ModelCardType {
	/**
	 * The cached value of the '{@link #getModelParameters() <em>Model Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelParameters()
	 * @generated
	 * @ordered
	 */
	protected ModelParametersType modelParameters;

	/**
	 * The cached value of the '{@link #getQuantitativeAnalysis() <em>Quantitative Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantitativeAnalysis()
	 * @generated
	 * @ordered
	 */
	protected QuantitativeAnalysisType quantitativeAnalysis;

	/**
	 * The cached value of the '{@link #getConsiderations() <em>Considerations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsiderations()
	 * @generated
	 * @ordered
	 */
	protected ConsiderationsType considerations;

	/**
	 * The default value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected String bomRef = BOM_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelCardTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getModelCardType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelParametersType getModelParameters() {
		return modelParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelParameters(ModelParametersType newModelParameters, NotificationChain msgs) {
		ModelParametersType oldModelParameters = modelParameters;
		modelParameters = newModelParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_CARD_TYPE__MODEL_PARAMETERS, oldModelParameters, newModelParameters);
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
	public void setModelParameters(ModelParametersType newModelParameters) {
		if (newModelParameters != modelParameters) {
			NotificationChain msgs = null;
			if (modelParameters != null)
				msgs = ((InternalEObject)modelParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MODEL_CARD_TYPE__MODEL_PARAMETERS, null, msgs);
			if (newModelParameters != null)
				msgs = ((InternalEObject)newModelParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MODEL_CARD_TYPE__MODEL_PARAMETERS, null, msgs);
			msgs = basicSetModelParameters(newModelParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_CARD_TYPE__MODEL_PARAMETERS, newModelParameters, newModelParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantitativeAnalysisType getQuantitativeAnalysis() {
		return quantitativeAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantitativeAnalysis(QuantitativeAnalysisType newQuantitativeAnalysis, NotificationChain msgs) {
		QuantitativeAnalysisType oldQuantitativeAnalysis = quantitativeAnalysis;
		quantitativeAnalysis = newQuantitativeAnalysis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_CARD_TYPE__QUANTITATIVE_ANALYSIS, oldQuantitativeAnalysis, newQuantitativeAnalysis);
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
	public void setQuantitativeAnalysis(QuantitativeAnalysisType newQuantitativeAnalysis) {
		if (newQuantitativeAnalysis != quantitativeAnalysis) {
			NotificationChain msgs = null;
			if (quantitativeAnalysis != null)
				msgs = ((InternalEObject)quantitativeAnalysis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MODEL_CARD_TYPE__QUANTITATIVE_ANALYSIS, null, msgs);
			if (newQuantitativeAnalysis != null)
				msgs = ((InternalEObject)newQuantitativeAnalysis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MODEL_CARD_TYPE__QUANTITATIVE_ANALYSIS, null, msgs);
			msgs = basicSetQuantitativeAnalysis(newQuantitativeAnalysis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_CARD_TYPE__QUANTITATIVE_ANALYSIS, newQuantitativeAnalysis, newQuantitativeAnalysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsiderationsType getConsiderations() {
		return considerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsiderations(ConsiderationsType newConsiderations, NotificationChain msgs) {
		ConsiderationsType oldConsiderations = considerations;
		considerations = newConsiderations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_CARD_TYPE__CONSIDERATIONS, oldConsiderations, newConsiderations);
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
	public void setConsiderations(ConsiderationsType newConsiderations) {
		if (newConsiderations != considerations) {
			NotificationChain msgs = null;
			if (considerations != null)
				msgs = ((InternalEObject)considerations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MODEL_CARD_TYPE__CONSIDERATIONS, null, msgs);
			if (newConsiderations != null)
				msgs = ((InternalEObject)newConsiderations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MODEL_CARD_TYPE__CONSIDERATIONS, null, msgs);
			msgs = basicSetConsiderations(newConsiderations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_CARD_TYPE__CONSIDERATIONS, newConsiderations, newConsiderations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBomRef() {
		return bomRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBomRef(String newBomRef) {
		String oldBomRef = bomRef;
		bomRef = newBomRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_CARD_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.MODEL_CARD_TYPE__MODEL_PARAMETERS:
				return basicSetModelParameters(null, msgs);
			case BOMPackage.MODEL_CARD_TYPE__QUANTITATIVE_ANALYSIS:
				return basicSetQuantitativeAnalysis(null, msgs);
			case BOMPackage.MODEL_CARD_TYPE__CONSIDERATIONS:
				return basicSetConsiderations(null, msgs);
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
			case BOMPackage.MODEL_CARD_TYPE__MODEL_PARAMETERS:
				return getModelParameters();
			case BOMPackage.MODEL_CARD_TYPE__QUANTITATIVE_ANALYSIS:
				return getQuantitativeAnalysis();
			case BOMPackage.MODEL_CARD_TYPE__CONSIDERATIONS:
				return getConsiderations();
			case BOMPackage.MODEL_CARD_TYPE__BOM_REF:
				return getBomRef();
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
			case BOMPackage.MODEL_CARD_TYPE__MODEL_PARAMETERS:
				setModelParameters((ModelParametersType)newValue);
				return;
			case BOMPackage.MODEL_CARD_TYPE__QUANTITATIVE_ANALYSIS:
				setQuantitativeAnalysis((QuantitativeAnalysisType)newValue);
				return;
			case BOMPackage.MODEL_CARD_TYPE__CONSIDERATIONS:
				setConsiderations((ConsiderationsType)newValue);
				return;
			case BOMPackage.MODEL_CARD_TYPE__BOM_REF:
				setBomRef((String)newValue);
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
			case BOMPackage.MODEL_CARD_TYPE__MODEL_PARAMETERS:
				setModelParameters((ModelParametersType)null);
				return;
			case BOMPackage.MODEL_CARD_TYPE__QUANTITATIVE_ANALYSIS:
				setQuantitativeAnalysis((QuantitativeAnalysisType)null);
				return;
			case BOMPackage.MODEL_CARD_TYPE__CONSIDERATIONS:
				setConsiderations((ConsiderationsType)null);
				return;
			case BOMPackage.MODEL_CARD_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
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
			case BOMPackage.MODEL_CARD_TYPE__MODEL_PARAMETERS:
				return modelParameters != null;
			case BOMPackage.MODEL_CARD_TYPE__QUANTITATIVE_ANALYSIS:
				return quantitativeAnalysis != null;
			case BOMPackage.MODEL_CARD_TYPE__CONSIDERATIONS:
				return considerations != null;
			case BOMPackage.MODEL_CARD_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
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
		result.append(" (bomRef: ");
		result.append(bomRef);
		result.append(')');
		return result.toString();
	}

} //ModelCardTypeImpl
