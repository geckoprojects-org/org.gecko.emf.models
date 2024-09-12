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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.isotc211._2005.gco.BooleanPropertyType;
import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.isotc211._2005.gmd.CICitationPropertyType;
import org.isotc211._2005.gmd.DQConformanceResultType;
import org.isotc211._2005.gmd.GMDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DQ Conformance Result Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.DQConformanceResultTypeImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DQConformanceResultTypeImpl#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DQConformanceResultTypeImpl#getPass <em>Pass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DQConformanceResultTypeImpl extends AbstractDQResultTypeImpl implements DQConformanceResultType {
	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected CICitationPropertyType specification;

	/**
	 * The cached value of the '{@link #getExplanation() <em>Explanation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplanation()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType explanation;

	/**
	 * The cached value of the '{@link #getPass() <em>Pass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPass()
	 * @generated
	 * @ordered
	 */
	protected BooleanPropertyType pass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DQConformanceResultTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getDQConformanceResultType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CICitationPropertyType getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(CICitationPropertyType newSpecification, NotificationChain msgs) {
		CICitationPropertyType oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__SPECIFICATION, oldSpecification, newSpecification);
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
	public void setSpecification(CICitationPropertyType newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getExplanation() {
		return explanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExplanation(CharacterStringPropertyType newExplanation, NotificationChain msgs) {
		CharacterStringPropertyType oldExplanation = explanation;
		explanation = newExplanation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__EXPLANATION, oldExplanation, newExplanation);
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
	public void setExplanation(CharacterStringPropertyType newExplanation) {
		if (newExplanation != explanation) {
			NotificationChain msgs = null;
			if (explanation != null)
				msgs = ((InternalEObject)explanation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__EXPLANATION, null, msgs);
			if (newExplanation != null)
				msgs = ((InternalEObject)newExplanation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__EXPLANATION, null, msgs);
			msgs = basicSetExplanation(newExplanation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__EXPLANATION, newExplanation, newExplanation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanPropertyType getPass() {
		return pass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPass(BooleanPropertyType newPass, NotificationChain msgs) {
		BooleanPropertyType oldPass = pass;
		pass = newPass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__PASS, oldPass, newPass);
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
	public void setPass(BooleanPropertyType newPass) {
		if (newPass != pass) {
			NotificationChain msgs = null;
			if (pass != null)
				msgs = ((InternalEObject)pass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__PASS, null, msgs);
			if (newPass != null)
				msgs = ((InternalEObject)newPass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__PASS, null, msgs);
			msgs = basicSetPass(newPass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__PASS, newPass, newPass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__EXPLANATION:
				return basicSetExplanation(null, msgs);
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__PASS:
				return basicSetPass(null, msgs);
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
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__SPECIFICATION:
				return getSpecification();
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__EXPLANATION:
				return getExplanation();
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__PASS:
				return getPass();
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
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__SPECIFICATION:
				setSpecification((CICitationPropertyType)newValue);
				return;
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__EXPLANATION:
				setExplanation((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__PASS:
				setPass((BooleanPropertyType)newValue);
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
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__SPECIFICATION:
				setSpecification((CICitationPropertyType)null);
				return;
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__EXPLANATION:
				setExplanation((CharacterStringPropertyType)null);
				return;
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__PASS:
				setPass((BooleanPropertyType)null);
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
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__SPECIFICATION:
				return specification != null;
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__EXPLANATION:
				return explanation != null;
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE__PASS:
				return pass != null;
		}
		return super.eIsSet(featureID);
	}

} //DQConformanceResultTypeImpl
