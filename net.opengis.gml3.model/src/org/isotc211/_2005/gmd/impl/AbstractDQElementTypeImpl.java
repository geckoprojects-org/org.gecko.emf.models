/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.DateTimePropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.AbstractDQElementType;
import org.isotc211._2005.gmd.CICitationPropertyType;
import org.isotc211._2005.gmd.DQEvaluationMethodTypeCodePropertyType;
import org.isotc211._2005.gmd.DQResultPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDIdentifierPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract DQ Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractDQElementTypeImpl#getNameOfMeasure <em>Name Of Measure</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractDQElementTypeImpl#getMeasureIdentification <em>Measure Identification</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractDQElementTypeImpl#getMeasureDescription <em>Measure Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractDQElementTypeImpl#getEvaluationMethodType <em>Evaluation Method Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractDQElementTypeImpl#getEvaluationMethodDescription <em>Evaluation Method Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractDQElementTypeImpl#getEvaluationProcedure <em>Evaluation Procedure</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractDQElementTypeImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractDQElementTypeImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractDQElementTypeImpl extends AbstractObjectTypeImpl implements AbstractDQElementType {
	/**
	 * The cached value of the '{@link #getNameOfMeasure() <em>Name Of Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOfMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterStringPropertyType> nameOfMeasure;

	/**
	 * The cached value of the '{@link #getMeasureIdentification() <em>Measure Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureIdentification()
	 * @generated
	 * @ordered
	 */
	protected MDIdentifierPropertyType measureIdentification;

	/**
	 * The cached value of the '{@link #getMeasureDescription() <em>Measure Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureDescription()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType measureDescription;

	/**
	 * The cached value of the '{@link #getEvaluationMethodType() <em>Evaluation Method Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationMethodType()
	 * @generated
	 * @ordered
	 */
	protected DQEvaluationMethodTypeCodePropertyType evaluationMethodType;

	/**
	 * The cached value of the '{@link #getEvaluationMethodDescription() <em>Evaluation Method Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationMethodDescription()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType evaluationMethodDescription;

	/**
	 * The cached value of the '{@link #getEvaluationProcedure() <em>Evaluation Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationProcedure()
	 * @generated
	 * @ordered
	 */
	protected CICitationPropertyType evaluationProcedure;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected EList<DateTimePropertyType> dateTime;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<DQResultPropertyType> result;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractDQElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getAbstractDQElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getNameOfMeasure() {
		if (nameOfMeasure == null) {
			nameOfMeasure = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__NAME_OF_MEASURE);
		}
		return nameOfMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDIdentifierPropertyType getMeasureIdentification() {
		return measureIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureIdentification(MDIdentifierPropertyType newMeasureIdentification, NotificationChain msgs) {
		MDIdentifierPropertyType oldMeasureIdentification = measureIdentification;
		measureIdentification = newMeasureIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_IDENTIFICATION, oldMeasureIdentification, newMeasureIdentification);
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
	public void setMeasureIdentification(MDIdentifierPropertyType newMeasureIdentification) {
		if (newMeasureIdentification != measureIdentification) {
			NotificationChain msgs = null;
			if (measureIdentification != null)
				msgs = ((InternalEObject)measureIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_IDENTIFICATION, null, msgs);
			if (newMeasureIdentification != null)
				msgs = ((InternalEObject)newMeasureIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_IDENTIFICATION, null, msgs);
			msgs = basicSetMeasureIdentification(newMeasureIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_IDENTIFICATION, newMeasureIdentification, newMeasureIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getMeasureDescription() {
		return measureDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureDescription(CharacterStringPropertyType newMeasureDescription, NotificationChain msgs) {
		CharacterStringPropertyType oldMeasureDescription = measureDescription;
		measureDescription = newMeasureDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_DESCRIPTION, oldMeasureDescription, newMeasureDescription);
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
	public void setMeasureDescription(CharacterStringPropertyType newMeasureDescription) {
		if (newMeasureDescription != measureDescription) {
			NotificationChain msgs = null;
			if (measureDescription != null)
				msgs = ((InternalEObject)measureDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_DESCRIPTION, null, msgs);
			if (newMeasureDescription != null)
				msgs = ((InternalEObject)newMeasureDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_DESCRIPTION, null, msgs);
			msgs = basicSetMeasureDescription(newMeasureDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_DESCRIPTION, newMeasureDescription, newMeasureDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQEvaluationMethodTypeCodePropertyType getEvaluationMethodType() {
		return evaluationMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluationMethodType(DQEvaluationMethodTypeCodePropertyType newEvaluationMethodType, NotificationChain msgs) {
		DQEvaluationMethodTypeCodePropertyType oldEvaluationMethodType = evaluationMethodType;
		evaluationMethodType = newEvaluationMethodType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_TYPE, oldEvaluationMethodType, newEvaluationMethodType);
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
	public void setEvaluationMethodType(DQEvaluationMethodTypeCodePropertyType newEvaluationMethodType) {
		if (newEvaluationMethodType != evaluationMethodType) {
			NotificationChain msgs = null;
			if (evaluationMethodType != null)
				msgs = ((InternalEObject)evaluationMethodType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_TYPE, null, msgs);
			if (newEvaluationMethodType != null)
				msgs = ((InternalEObject)newEvaluationMethodType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_TYPE, null, msgs);
			msgs = basicSetEvaluationMethodType(newEvaluationMethodType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_TYPE, newEvaluationMethodType, newEvaluationMethodType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getEvaluationMethodDescription() {
		return evaluationMethodDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluationMethodDescription(CharacterStringPropertyType newEvaluationMethodDescription, NotificationChain msgs) {
		CharacterStringPropertyType oldEvaluationMethodDescription = evaluationMethodDescription;
		evaluationMethodDescription = newEvaluationMethodDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_DESCRIPTION, oldEvaluationMethodDescription, newEvaluationMethodDescription);
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
	public void setEvaluationMethodDescription(CharacterStringPropertyType newEvaluationMethodDescription) {
		if (newEvaluationMethodDescription != evaluationMethodDescription) {
			NotificationChain msgs = null;
			if (evaluationMethodDescription != null)
				msgs = ((InternalEObject)evaluationMethodDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_DESCRIPTION, null, msgs);
			if (newEvaluationMethodDescription != null)
				msgs = ((InternalEObject)newEvaluationMethodDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_DESCRIPTION, null, msgs);
			msgs = basicSetEvaluationMethodDescription(newEvaluationMethodDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_DESCRIPTION, newEvaluationMethodDescription, newEvaluationMethodDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CICitationPropertyType getEvaluationProcedure() {
		return evaluationProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluationProcedure(CICitationPropertyType newEvaluationProcedure, NotificationChain msgs) {
		CICitationPropertyType oldEvaluationProcedure = evaluationProcedure;
		evaluationProcedure = newEvaluationProcedure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_PROCEDURE, oldEvaluationProcedure, newEvaluationProcedure);
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
	public void setEvaluationProcedure(CICitationPropertyType newEvaluationProcedure) {
		if (newEvaluationProcedure != evaluationProcedure) {
			NotificationChain msgs = null;
			if (evaluationProcedure != null)
				msgs = ((InternalEObject)evaluationProcedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_PROCEDURE, null, msgs);
			if (newEvaluationProcedure != null)
				msgs = ((InternalEObject)newEvaluationProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_PROCEDURE, null, msgs);
			msgs = basicSetEvaluationProcedure(newEvaluationProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_PROCEDURE, newEvaluationProcedure, newEvaluationProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DateTimePropertyType> getDateTime() {
		if (dateTime == null) {
			dateTime = new EObjectContainmentEList<DateTimePropertyType>(DateTimePropertyType.class, this, GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__DATE_TIME);
		}
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DQResultPropertyType> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<DQResultPropertyType>(DQResultPropertyType.class, this, GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__NAME_OF_MEASURE:
				return ((InternalEList<?>)getNameOfMeasure()).basicRemove(otherEnd, msgs);
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_IDENTIFICATION:
				return basicSetMeasureIdentification(null, msgs);
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_DESCRIPTION:
				return basicSetMeasureDescription(null, msgs);
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_TYPE:
				return basicSetEvaluationMethodType(null, msgs);
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_DESCRIPTION:
				return basicSetEvaluationMethodDescription(null, msgs);
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_PROCEDURE:
				return basicSetEvaluationProcedure(null, msgs);
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__DATE_TIME:
				return ((InternalEList<?>)getDateTime()).basicRemove(otherEnd, msgs);
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__NAME_OF_MEASURE:
				return getNameOfMeasure();
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_IDENTIFICATION:
				return getMeasureIdentification();
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_DESCRIPTION:
				return getMeasureDescription();
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_TYPE:
				return getEvaluationMethodType();
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_DESCRIPTION:
				return getEvaluationMethodDescription();
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_PROCEDURE:
				return getEvaluationProcedure();
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__DATE_TIME:
				return getDateTime();
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__RESULT:
				return getResult();
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
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__NAME_OF_MEASURE:
				getNameOfMeasure().clear();
				getNameOfMeasure().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
				return;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_IDENTIFICATION:
				setMeasureIdentification((MDIdentifierPropertyType)newValue);
				return;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_DESCRIPTION:
				setMeasureDescription((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_TYPE:
				setEvaluationMethodType((DQEvaluationMethodTypeCodePropertyType)newValue);
				return;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_DESCRIPTION:
				setEvaluationMethodDescription((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_PROCEDURE:
				setEvaluationProcedure((CICitationPropertyType)newValue);
				return;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__DATE_TIME:
				getDateTime().clear();
				getDateTime().addAll((Collection<? extends DateTimePropertyType>)newValue);
				return;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends DQResultPropertyType>)newValue);
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
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__NAME_OF_MEASURE:
				getNameOfMeasure().clear();
				return;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_IDENTIFICATION:
				setMeasureIdentification((MDIdentifierPropertyType)null);
				return;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_DESCRIPTION:
				setMeasureDescription((CharacterStringPropertyType)null);
				return;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_TYPE:
				setEvaluationMethodType((DQEvaluationMethodTypeCodePropertyType)null);
				return;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_DESCRIPTION:
				setEvaluationMethodDescription((CharacterStringPropertyType)null);
				return;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_PROCEDURE:
				setEvaluationProcedure((CICitationPropertyType)null);
				return;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__DATE_TIME:
				getDateTime().clear();
				return;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__RESULT:
				getResult().clear();
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
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__NAME_OF_MEASURE:
				return nameOfMeasure != null && !nameOfMeasure.isEmpty();
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_IDENTIFICATION:
				return measureIdentification != null;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__MEASURE_DESCRIPTION:
				return measureDescription != null;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_TYPE:
				return evaluationMethodType != null;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_METHOD_DESCRIPTION:
				return evaluationMethodDescription != null;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__EVALUATION_PROCEDURE:
				return evaluationProcedure != null;
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__DATE_TIME:
				return dateTime != null && !dateTime.isEmpty();
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE__RESULT:
				return result != null && !result.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractDQElementTypeImpl
