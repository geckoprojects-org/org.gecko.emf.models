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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO;
import org.emau.icmvc.ganimed.ttp.cm2.QcProblemStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qc Problem DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QcProblemDTOImpl#getCommentExtern <em>Comment Extern</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QcProblemDTOImpl#getCommentIntern <em>Comment Intern</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QcProblemDTOImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QcProblemDTOImpl#getFormValue <em>Form Value</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QcProblemDTOImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QcProblemDTOImpl#getScanValue <em>Scan Value</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QcProblemDTOImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.QcProblemDTOImpl#getUpdatedAt <em>Updated At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QcProblemDTOImpl extends FhirIdDTOImpl implements QcProblemDTO {
	/**
	 * The default value of the '{@link #getCommentExtern() <em>Comment Extern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentExtern()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EXTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentExtern() <em>Comment Extern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentExtern()
	 * @generated
	 * @ordered
	 */
	protected String commentExtern = COMMENT_EXTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentIntern() <em>Comment Intern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentIntern()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_INTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentIntern() <em>Comment Intern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentIntern()
	 * @generated
	 * @ordered
	 */
	protected String commentIntern = COMMENT_INTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar createdAt = CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormValue() <em>Form Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormValue()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormValue() <em>Form Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormValue()
	 * @generated
	 * @ordered
	 */
	protected String formValue = FORM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getScanValue() <em>Scan Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanValue()
	 * @generated
	 * @ordered
	 */
	protected static final String SCAN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScanValue() <em>Scan Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanValue()
	 * @generated
	 * @ordered
	 */
	protected String scanValue = SCAN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final QcProblemStatus STATUS_EDEFAULT = QcProblemStatus.OPENEXTERN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected QcProblemStatus status = STATUS_EDEFAULT;

	/**
	 * This is true if the Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusESet;

	/**
	 * The default value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar UPDATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar updatedAt = UPDATED_AT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QcProblemDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getQcProblemDTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommentExtern() {
		return commentExtern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommentExtern(String newCommentExtern) {
		String oldCommentExtern = commentExtern;
		commentExtern = newCommentExtern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.QC_PROBLEM_DTO__COMMENT_EXTERN, oldCommentExtern, commentExtern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommentIntern() {
		return commentIntern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommentIntern(String newCommentIntern) {
		String oldCommentIntern = commentIntern;
		commentIntern = newCommentIntern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.QC_PROBLEM_DTO__COMMENT_INTERN, oldCommentIntern, commentIntern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getCreatedAt() {
		return createdAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(XMLGregorianCalendar newCreatedAt) {
		XMLGregorianCalendar oldCreatedAt = createdAt;
		createdAt = newCreatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.QC_PROBLEM_DTO__CREATED_AT, oldCreatedAt, createdAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormValue() {
		return formValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormValue(String newFormValue) {
		String oldFormValue = formValue;
		formValue = newFormValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.QC_PROBLEM_DTO__FORM_VALUE, oldFormValue, formValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.QC_PROBLEM_DTO__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScanValue() {
		return scanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScanValue(String newScanValue) {
		String oldScanValue = scanValue;
		scanValue = newScanValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.QC_PROBLEM_DTO__SCAN_VALUE, oldScanValue, scanValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QcProblemStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(QcProblemStatus newStatus) {
		QcProblemStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		boolean oldStatusESet = statusESet;
		statusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.QC_PROBLEM_DTO__STATUS, oldStatus, status, !oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStatus() {
		QcProblemStatus oldStatus = status;
		boolean oldStatusESet = statusESet;
		status = STATUS_EDEFAULT;
		statusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.QC_PROBLEM_DTO__STATUS, oldStatus, STATUS_EDEFAULT, oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStatus() {
		return statusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdatedAt(XMLGregorianCalendar newUpdatedAt) {
		XMLGregorianCalendar oldUpdatedAt = updatedAt;
		updatedAt = newUpdatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.QC_PROBLEM_DTO__UPDATED_AT, oldUpdatedAt, updatedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cm2Package.QC_PROBLEM_DTO__COMMENT_EXTERN:
				return getCommentExtern();
			case Cm2Package.QC_PROBLEM_DTO__COMMENT_INTERN:
				return getCommentIntern();
			case Cm2Package.QC_PROBLEM_DTO__CREATED_AT:
				return getCreatedAt();
			case Cm2Package.QC_PROBLEM_DTO__FORM_VALUE:
				return getFormValue();
			case Cm2Package.QC_PROBLEM_DTO__REF:
				return getRef();
			case Cm2Package.QC_PROBLEM_DTO__SCAN_VALUE:
				return getScanValue();
			case Cm2Package.QC_PROBLEM_DTO__STATUS:
				return getStatus();
			case Cm2Package.QC_PROBLEM_DTO__UPDATED_AT:
				return getUpdatedAt();
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
			case Cm2Package.QC_PROBLEM_DTO__COMMENT_EXTERN:
				setCommentExtern((String)newValue);
				return;
			case Cm2Package.QC_PROBLEM_DTO__COMMENT_INTERN:
				setCommentIntern((String)newValue);
				return;
			case Cm2Package.QC_PROBLEM_DTO__CREATED_AT:
				setCreatedAt((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.QC_PROBLEM_DTO__FORM_VALUE:
				setFormValue((String)newValue);
				return;
			case Cm2Package.QC_PROBLEM_DTO__REF:
				setRef((String)newValue);
				return;
			case Cm2Package.QC_PROBLEM_DTO__SCAN_VALUE:
				setScanValue((String)newValue);
				return;
			case Cm2Package.QC_PROBLEM_DTO__STATUS:
				setStatus((QcProblemStatus)newValue);
				return;
			case Cm2Package.QC_PROBLEM_DTO__UPDATED_AT:
				setUpdatedAt((XMLGregorianCalendar)newValue);
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
			case Cm2Package.QC_PROBLEM_DTO__COMMENT_EXTERN:
				setCommentExtern(COMMENT_EXTERN_EDEFAULT);
				return;
			case Cm2Package.QC_PROBLEM_DTO__COMMENT_INTERN:
				setCommentIntern(COMMENT_INTERN_EDEFAULT);
				return;
			case Cm2Package.QC_PROBLEM_DTO__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case Cm2Package.QC_PROBLEM_DTO__FORM_VALUE:
				setFormValue(FORM_VALUE_EDEFAULT);
				return;
			case Cm2Package.QC_PROBLEM_DTO__REF:
				setRef(REF_EDEFAULT);
				return;
			case Cm2Package.QC_PROBLEM_DTO__SCAN_VALUE:
				setScanValue(SCAN_VALUE_EDEFAULT);
				return;
			case Cm2Package.QC_PROBLEM_DTO__STATUS:
				unsetStatus();
				return;
			case Cm2Package.QC_PROBLEM_DTO__UPDATED_AT:
				setUpdatedAt(UPDATED_AT_EDEFAULT);
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
			case Cm2Package.QC_PROBLEM_DTO__COMMENT_EXTERN:
				return COMMENT_EXTERN_EDEFAULT == null ? commentExtern != null : !COMMENT_EXTERN_EDEFAULT.equals(commentExtern);
			case Cm2Package.QC_PROBLEM_DTO__COMMENT_INTERN:
				return COMMENT_INTERN_EDEFAULT == null ? commentIntern != null : !COMMENT_INTERN_EDEFAULT.equals(commentIntern);
			case Cm2Package.QC_PROBLEM_DTO__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? createdAt != null : !CREATED_AT_EDEFAULT.equals(createdAt);
			case Cm2Package.QC_PROBLEM_DTO__FORM_VALUE:
				return FORM_VALUE_EDEFAULT == null ? formValue != null : !FORM_VALUE_EDEFAULT.equals(formValue);
			case Cm2Package.QC_PROBLEM_DTO__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case Cm2Package.QC_PROBLEM_DTO__SCAN_VALUE:
				return SCAN_VALUE_EDEFAULT == null ? scanValue != null : !SCAN_VALUE_EDEFAULT.equals(scanValue);
			case Cm2Package.QC_PROBLEM_DTO__STATUS:
				return isSetStatus();
			case Cm2Package.QC_PROBLEM_DTO__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? updatedAt != null : !UPDATED_AT_EDEFAULT.equals(updatedAt);
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
		result.append(" (commentExtern: ");
		result.append(commentExtern);
		result.append(", commentIntern: ");
		result.append(commentIntern);
		result.append(", createdAt: ");
		result.append(createdAt);
		result.append(", formValue: ");
		result.append(formValue);
		result.append(", ref: ");
		result.append(ref);
		result.append(", scanValue: ");
		result.append(scanValue);
		result.append(", status: ");
		if (statusESet) result.append(status); else result.append("<unset>");
		result.append(", updatedAt: ");
		result.append(updatedAt);
		result.append(')');
		return result.toString();
	}

} //QcProblemDTOImpl
