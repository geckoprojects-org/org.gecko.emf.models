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

import javax.xml.datatype.XMLGregorianCalendar;

import org.cyclonedx.schema.bom.AnalysisType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.ImpactAnalysisJustificationType;
import org.cyclonedx.schema.bom.ImpactAnalysisStateType;
import org.cyclonedx.schema.bom.ResponsesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AnalysisTypeImpl#getState <em>State</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AnalysisTypeImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AnalysisTypeImpl#getResponses <em>Responses</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AnalysisTypeImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AnalysisTypeImpl#getFirstIssued <em>First Issued</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AnalysisTypeImpl#getLastUpdated <em>Last Updated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisTypeImpl extends MinimalEObjectImpl.Container implements AnalysisType {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final ImpactAnalysisStateType STATE_EDEFAULT = ImpactAnalysisStateType.RESOLVED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ImpactAnalysisStateType state = STATE_EDEFAULT;

	/**
	 * This is true if the State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stateESet;

	/**
	 * The default value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected static final ImpactAnalysisJustificationType JUSTIFICATION_EDEFAULT = ImpactAnalysisJustificationType.CODE_NOT_PRESENT;

	/**
	 * The cached value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected ImpactAnalysisJustificationType justification = JUSTIFICATION_EDEFAULT;

	/**
	 * This is true if the Justification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean justificationESet;

	/**
	 * The cached value of the '{@link #getResponses() <em>Responses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponses()
	 * @generated
	 * @ordered
	 */
	protected ResponsesType responses;

	/**
	 * The default value of the '{@link #getDetail() <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected String detail = DETAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstIssued() <em>First Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstIssued()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIRST_ISSUED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstIssued() <em>First Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstIssued()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar firstIssued = FIRST_ISSUED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastUpdated() <em>Last Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdated()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_UPDATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastUpdated() <em>Last Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdated()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastUpdated = LAST_UPDATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getAnalysisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpactAnalysisStateType getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(ImpactAnalysisStateType newState) {
		ImpactAnalysisStateType oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		boolean oldStateESet = stateESet;
		stateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ANALYSIS_TYPE__STATE, oldState, state, !oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetState() {
		ImpactAnalysisStateType oldState = state;
		boolean oldStateESet = stateESet;
		state = STATE_EDEFAULT;
		stateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.ANALYSIS_TYPE__STATE, oldState, STATE_EDEFAULT, oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetState() {
		return stateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpactAnalysisJustificationType getJustification() {
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJustification(ImpactAnalysisJustificationType newJustification) {
		ImpactAnalysisJustificationType oldJustification = justification;
		justification = newJustification == null ? JUSTIFICATION_EDEFAULT : newJustification;
		boolean oldJustificationESet = justificationESet;
		justificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ANALYSIS_TYPE__JUSTIFICATION, oldJustification, justification, !oldJustificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetJustification() {
		ImpactAnalysisJustificationType oldJustification = justification;
		boolean oldJustificationESet = justificationESet;
		justification = JUSTIFICATION_EDEFAULT;
		justificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.ANALYSIS_TYPE__JUSTIFICATION, oldJustification, JUSTIFICATION_EDEFAULT, oldJustificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetJustification() {
		return justificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponsesType getResponses() {
		return responses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponses(ResponsesType newResponses, NotificationChain msgs) {
		ResponsesType oldResponses = responses;
		responses = newResponses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.ANALYSIS_TYPE__RESPONSES, oldResponses, newResponses);
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
	public void setResponses(ResponsesType newResponses) {
		if (newResponses != responses) {
			NotificationChain msgs = null;
			if (responses != null)
				msgs = ((InternalEObject)responses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ANALYSIS_TYPE__RESPONSES, null, msgs);
			if (newResponses != null)
				msgs = ((InternalEObject)newResponses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ANALYSIS_TYPE__RESPONSES, null, msgs);
			msgs = basicSetResponses(newResponses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ANALYSIS_TYPE__RESPONSES, newResponses, newResponses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetail(String newDetail) {
		String oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ANALYSIS_TYPE__DETAIL, oldDetail, detail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getFirstIssued() {
		return firstIssued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstIssued(XMLGregorianCalendar newFirstIssued) {
		XMLGregorianCalendar oldFirstIssued = firstIssued;
		firstIssued = newFirstIssued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ANALYSIS_TYPE__FIRST_ISSUED, oldFirstIssued, firstIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdated(XMLGregorianCalendar newLastUpdated) {
		XMLGregorianCalendar oldLastUpdated = lastUpdated;
		lastUpdated = newLastUpdated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ANALYSIS_TYPE__LAST_UPDATED, oldLastUpdated, lastUpdated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.ANALYSIS_TYPE__RESPONSES:
				return basicSetResponses(null, msgs);
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
			case BOMPackage.ANALYSIS_TYPE__STATE:
				return getState();
			case BOMPackage.ANALYSIS_TYPE__JUSTIFICATION:
				return getJustification();
			case BOMPackage.ANALYSIS_TYPE__RESPONSES:
				return getResponses();
			case BOMPackage.ANALYSIS_TYPE__DETAIL:
				return getDetail();
			case BOMPackage.ANALYSIS_TYPE__FIRST_ISSUED:
				return getFirstIssued();
			case BOMPackage.ANALYSIS_TYPE__LAST_UPDATED:
				return getLastUpdated();
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
			case BOMPackage.ANALYSIS_TYPE__STATE:
				setState((ImpactAnalysisStateType)newValue);
				return;
			case BOMPackage.ANALYSIS_TYPE__JUSTIFICATION:
				setJustification((ImpactAnalysisJustificationType)newValue);
				return;
			case BOMPackage.ANALYSIS_TYPE__RESPONSES:
				setResponses((ResponsesType)newValue);
				return;
			case BOMPackage.ANALYSIS_TYPE__DETAIL:
				setDetail((String)newValue);
				return;
			case BOMPackage.ANALYSIS_TYPE__FIRST_ISSUED:
				setFirstIssued((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.ANALYSIS_TYPE__LAST_UPDATED:
				setLastUpdated((XMLGregorianCalendar)newValue);
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
			case BOMPackage.ANALYSIS_TYPE__STATE:
				unsetState();
				return;
			case BOMPackage.ANALYSIS_TYPE__JUSTIFICATION:
				unsetJustification();
				return;
			case BOMPackage.ANALYSIS_TYPE__RESPONSES:
				setResponses((ResponsesType)null);
				return;
			case BOMPackage.ANALYSIS_TYPE__DETAIL:
				setDetail(DETAIL_EDEFAULT);
				return;
			case BOMPackage.ANALYSIS_TYPE__FIRST_ISSUED:
				setFirstIssued(FIRST_ISSUED_EDEFAULT);
				return;
			case BOMPackage.ANALYSIS_TYPE__LAST_UPDATED:
				setLastUpdated(LAST_UPDATED_EDEFAULT);
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
			case BOMPackage.ANALYSIS_TYPE__STATE:
				return isSetState();
			case BOMPackage.ANALYSIS_TYPE__JUSTIFICATION:
				return isSetJustification();
			case BOMPackage.ANALYSIS_TYPE__RESPONSES:
				return responses != null;
			case BOMPackage.ANALYSIS_TYPE__DETAIL:
				return DETAIL_EDEFAULT == null ? detail != null : !DETAIL_EDEFAULT.equals(detail);
			case BOMPackage.ANALYSIS_TYPE__FIRST_ISSUED:
				return FIRST_ISSUED_EDEFAULT == null ? firstIssued != null : !FIRST_ISSUED_EDEFAULT.equals(firstIssued);
			case BOMPackage.ANALYSIS_TYPE__LAST_UPDATED:
				return LAST_UPDATED_EDEFAULT == null ? lastUpdated != null : !LAST_UPDATED_EDEFAULT.equals(lastUpdated);
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
		result.append(" (state: ");
		if (stateESet) result.append(state); else result.append("<unset>");
		result.append(", justification: ");
		if (justificationESet) result.append(justification); else result.append("<unset>");
		result.append(", detail: ");
		result.append(detail);
		result.append(", firstIssued: ");
		result.append(firstIssued);
		result.append(", lastUpdated: ");
		result.append(lastUpdated);
		result.append(')');
		return result.toString();
	}

} //AnalysisTypeImpl
