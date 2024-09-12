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
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.TestReportActionResult;
import org.hl7.fhir.TestReportAssert;
import org.hl7.fhir.TestReportRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Report Assert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestReportAssertImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestReportAssertImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestReportAssertImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestReportAssertImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestReportAssertImpl extends BackboneElementImpl implements TestReportAssert {
	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected TestReportActionResult result;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Markdown message;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String detail;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<TestReportRequirement> requirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestReportAssertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getTestReportAssert();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportActionResult getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(TestReportActionResult newResult, NotificationChain msgs) {
		TestReportActionResult oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_REPORT_ASSERT__RESULT, oldResult, newResult);
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
	public void setResult(TestReportActionResult newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_REPORT_ASSERT__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_REPORT_ASSERT__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_REPORT_ASSERT__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(Markdown newMessage, NotificationChain msgs) {
		Markdown oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_REPORT_ASSERT__MESSAGE, oldMessage, newMessage);
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
	public void setMessage(Markdown newMessage) {
		if (newMessage != message) {
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_REPORT_ASSERT__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_REPORT_ASSERT__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_REPORT_ASSERT__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetail(org.hl7.fhir.String newDetail, NotificationChain msgs) {
		org.hl7.fhir.String oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_REPORT_ASSERT__DETAIL, oldDetail, newDetail);
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
	public void setDetail(org.hl7.fhir.String newDetail) {
		if (newDetail != detail) {
			NotificationChain msgs = null;
			if (detail != null)
				msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_REPORT_ASSERT__DETAIL, null, msgs);
			if (newDetail != null)
				msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TEST_REPORT_ASSERT__DETAIL, null, msgs);
			msgs = basicSetDetail(newDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.TEST_REPORT_ASSERT__DETAIL, newDetail, newDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestReportRequirement> getRequirement() {
		if (requirement == null) {
			requirement = new EObjectContainmentEList<TestReportRequirement>(TestReportRequirement.class, this, FHIRPackage.TEST_REPORT_ASSERT__REQUIREMENT);
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.TEST_REPORT_ASSERT__RESULT:
				return basicSetResult(null, msgs);
			case FHIRPackage.TEST_REPORT_ASSERT__MESSAGE:
				return basicSetMessage(null, msgs);
			case FHIRPackage.TEST_REPORT_ASSERT__DETAIL:
				return basicSetDetail(null, msgs);
			case FHIRPackage.TEST_REPORT_ASSERT__REQUIREMENT:
				return ((InternalEList<?>)getRequirement()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.TEST_REPORT_ASSERT__RESULT:
				return getResult();
			case FHIRPackage.TEST_REPORT_ASSERT__MESSAGE:
				return getMessage();
			case FHIRPackage.TEST_REPORT_ASSERT__DETAIL:
				return getDetail();
			case FHIRPackage.TEST_REPORT_ASSERT__REQUIREMENT:
				return getRequirement();
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
			case FHIRPackage.TEST_REPORT_ASSERT__RESULT:
				setResult((TestReportActionResult)newValue);
				return;
			case FHIRPackage.TEST_REPORT_ASSERT__MESSAGE:
				setMessage((Markdown)newValue);
				return;
			case FHIRPackage.TEST_REPORT_ASSERT__DETAIL:
				setDetail((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.TEST_REPORT_ASSERT__REQUIREMENT:
				getRequirement().clear();
				getRequirement().addAll((Collection<? extends TestReportRequirement>)newValue);
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
			case FHIRPackage.TEST_REPORT_ASSERT__RESULT:
				setResult((TestReportActionResult)null);
				return;
			case FHIRPackage.TEST_REPORT_ASSERT__MESSAGE:
				setMessage((Markdown)null);
				return;
			case FHIRPackage.TEST_REPORT_ASSERT__DETAIL:
				setDetail((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.TEST_REPORT_ASSERT__REQUIREMENT:
				getRequirement().clear();
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
			case FHIRPackage.TEST_REPORT_ASSERT__RESULT:
				return result != null;
			case FHIRPackage.TEST_REPORT_ASSERT__MESSAGE:
				return message != null;
			case FHIRPackage.TEST_REPORT_ASSERT__DETAIL:
				return detail != null;
			case FHIRPackage.TEST_REPORT_ASSERT__REQUIREMENT:
				return requirement != null && !requirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestReportAssertImpl
