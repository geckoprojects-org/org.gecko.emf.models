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
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signer Id DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SignerIdDTOImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SignerIdDTOImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SignerIdDTOImpl#getIdType <em>Id Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SignerIdDTOImpl#getOrderNumber <em>Order Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignerIdDTOImpl extends FhirIdDTOImpl implements SignerIdDTO {
	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdType() <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdType()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdType() <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdType()
	 * @generated
	 * @ordered
	 */
	protected String idType = ID_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderNumber() <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrderNumber() <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected int orderNumber = ORDER_NUMBER_EDEFAULT;

	/**
	 * This is true if the Order Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orderNumberESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignerIdDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getSignerIdDTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(XMLGregorianCalendar newCreationDate) {
		XMLGregorianCalendar oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.SIGNER_ID_DTO__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.SIGNER_ID_DTO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdType() {
		return idType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdType(String newIdType) {
		String oldIdType = idType;
		idType = newIdType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.SIGNER_ID_DTO__ID_TYPE, oldIdType, idType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOrderNumber() {
		return orderNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderNumber(int newOrderNumber) {
		int oldOrderNumber = orderNumber;
		orderNumber = newOrderNumber;
		boolean oldOrderNumberESet = orderNumberESet;
		orderNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.SIGNER_ID_DTO__ORDER_NUMBER, oldOrderNumber, orderNumber, !oldOrderNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOrderNumber() {
		int oldOrderNumber = orderNumber;
		boolean oldOrderNumberESet = orderNumberESet;
		orderNumber = ORDER_NUMBER_EDEFAULT;
		orderNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.SIGNER_ID_DTO__ORDER_NUMBER, oldOrderNumber, ORDER_NUMBER_EDEFAULT, oldOrderNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOrderNumber() {
		return orderNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cm2Package.SIGNER_ID_DTO__CREATION_DATE:
				return getCreationDate();
			case Cm2Package.SIGNER_ID_DTO__ID:
				return getId();
			case Cm2Package.SIGNER_ID_DTO__ID_TYPE:
				return getIdType();
			case Cm2Package.SIGNER_ID_DTO__ORDER_NUMBER:
				return getOrderNumber();
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
			case Cm2Package.SIGNER_ID_DTO__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.SIGNER_ID_DTO__ID:
				setId((String)newValue);
				return;
			case Cm2Package.SIGNER_ID_DTO__ID_TYPE:
				setIdType((String)newValue);
				return;
			case Cm2Package.SIGNER_ID_DTO__ORDER_NUMBER:
				setOrderNumber((Integer)newValue);
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
			case Cm2Package.SIGNER_ID_DTO__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case Cm2Package.SIGNER_ID_DTO__ID:
				setId(ID_EDEFAULT);
				return;
			case Cm2Package.SIGNER_ID_DTO__ID_TYPE:
				setIdType(ID_TYPE_EDEFAULT);
				return;
			case Cm2Package.SIGNER_ID_DTO__ORDER_NUMBER:
				unsetOrderNumber();
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
			case Cm2Package.SIGNER_ID_DTO__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case Cm2Package.SIGNER_ID_DTO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Cm2Package.SIGNER_ID_DTO__ID_TYPE:
				return ID_TYPE_EDEFAULT == null ? idType != null : !ID_TYPE_EDEFAULT.equals(idType);
			case Cm2Package.SIGNER_ID_DTO__ORDER_NUMBER:
				return isSetOrderNumber();
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
		result.append(" (creationDate: ");
		result.append(creationDate);
		result.append(", id: ");
		result.append(id);
		result.append(", idType: ");
		result.append(idType);
		result.append(", orderNumber: ");
		if (orderNumberESet) result.append(orderNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SignerIdDTOImpl
