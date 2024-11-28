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
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signer Id Type DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SignerIdTypeDTOImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SignerIdTypeDTOImpl#getCreateTimestamp <em>Create Timestamp</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SignerIdTypeDTOImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SignerIdTypeDTOImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SignerIdTypeDTOImpl#getUpdateTimestamp <em>Update Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignerIdTypeDTOImpl extends FhirIdDTOImpl implements SignerIdTypeDTO {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreateTimestamp() <em>Create Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATE_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreateTimestamp() <em>Create Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar createTimestamp = CREATE_TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateTimestamp() <em>Update Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar UPDATE_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateTimestamp() <em>Update Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar updateTimestamp = UPDATE_TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignerIdTypeDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getSignerIdTypeDTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.SIGNER_ID_TYPE_DTO__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getCreateTimestamp() {
		return createTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateTimestamp(XMLGregorianCalendar newCreateTimestamp) {
		XMLGregorianCalendar oldCreateTimestamp = createTimestamp;
		createTimestamp = newCreateTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.SIGNER_ID_TYPE_DTO__CREATE_TIMESTAMP, oldCreateTimestamp, createTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.SIGNER_ID_TYPE_DTO__LABEL, oldLabel, label));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.SIGNER_ID_TYPE_DTO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getUpdateTimestamp() {
		return updateTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateTimestamp(XMLGregorianCalendar newUpdateTimestamp) {
		XMLGregorianCalendar oldUpdateTimestamp = updateTimestamp;
		updateTimestamp = newUpdateTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.SIGNER_ID_TYPE_DTO__UPDATE_TIMESTAMP, oldUpdateTimestamp, updateTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cm2Package.SIGNER_ID_TYPE_DTO__COMMENT:
				return getComment();
			case Cm2Package.SIGNER_ID_TYPE_DTO__CREATE_TIMESTAMP:
				return getCreateTimestamp();
			case Cm2Package.SIGNER_ID_TYPE_DTO__LABEL:
				return getLabel();
			case Cm2Package.SIGNER_ID_TYPE_DTO__NAME:
				return getName();
			case Cm2Package.SIGNER_ID_TYPE_DTO__UPDATE_TIMESTAMP:
				return getUpdateTimestamp();
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
			case Cm2Package.SIGNER_ID_TYPE_DTO__COMMENT:
				setComment((String)newValue);
				return;
			case Cm2Package.SIGNER_ID_TYPE_DTO__CREATE_TIMESTAMP:
				setCreateTimestamp((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.SIGNER_ID_TYPE_DTO__LABEL:
				setLabel((String)newValue);
				return;
			case Cm2Package.SIGNER_ID_TYPE_DTO__NAME:
				setName((String)newValue);
				return;
			case Cm2Package.SIGNER_ID_TYPE_DTO__UPDATE_TIMESTAMP:
				setUpdateTimestamp((XMLGregorianCalendar)newValue);
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
			case Cm2Package.SIGNER_ID_TYPE_DTO__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Cm2Package.SIGNER_ID_TYPE_DTO__CREATE_TIMESTAMP:
				setCreateTimestamp(CREATE_TIMESTAMP_EDEFAULT);
				return;
			case Cm2Package.SIGNER_ID_TYPE_DTO__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Cm2Package.SIGNER_ID_TYPE_DTO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Cm2Package.SIGNER_ID_TYPE_DTO__UPDATE_TIMESTAMP:
				setUpdateTimestamp(UPDATE_TIMESTAMP_EDEFAULT);
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
			case Cm2Package.SIGNER_ID_TYPE_DTO__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Cm2Package.SIGNER_ID_TYPE_DTO__CREATE_TIMESTAMP:
				return CREATE_TIMESTAMP_EDEFAULT == null ? createTimestamp != null : !CREATE_TIMESTAMP_EDEFAULT.equals(createTimestamp);
			case Cm2Package.SIGNER_ID_TYPE_DTO__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case Cm2Package.SIGNER_ID_TYPE_DTO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Cm2Package.SIGNER_ID_TYPE_DTO__UPDATE_TIMESTAMP:
				return UPDATE_TIMESTAMP_EDEFAULT == null ? updateTimestamp != null : !UPDATE_TIMESTAMP_EDEFAULT.equals(updateTimestamp);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", createTimestamp: ");
		result.append(createTimestamp);
		result.append(", label: ");
		result.append(label);
		result.append(", name: ");
		result.append(name);
		result.append(", updateTimestamp: ");
		result.append(updateTimestamp);
		result.append(')');
		return result.toString();
	}

} //SignerIdTypeDTOImpl
