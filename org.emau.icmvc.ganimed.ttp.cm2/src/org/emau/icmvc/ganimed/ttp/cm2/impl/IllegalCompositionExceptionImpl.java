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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.IllegalCompositionException;
import org.emau.icmvc.ganimed.ttp.cm2.ItemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Illegal Composition Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.IllegalCompositionExceptionImpl#getIllegalItemType <em>Illegal Item Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.IllegalCompositionExceptionImpl#getIllegalItem <em>Illegal Item</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.IllegalCompositionExceptionImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IllegalCompositionExceptionImpl extends MinimalEObjectImpl.Container implements IllegalCompositionException {
	/**
	 * The default value of the '{@link #getIllegalItemType() <em>Illegal Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIllegalItemType()
	 * @generated
	 * @ordered
	 */
	protected static final ItemType ILLEGAL_ITEM_TYPE_EDEFAULT = ItemType.POLICY;

	/**
	 * The cached value of the '{@link #getIllegalItemType() <em>Illegal Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIllegalItemType()
	 * @generated
	 * @ordered
	 */
	protected ItemType illegalItemType = ILLEGAL_ITEM_TYPE_EDEFAULT;

	/**
	 * This is true if the Illegal Item Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean illegalItemTypeESet;

	/**
	 * The default value of the '{@link #getIllegalItem() <em>Illegal Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIllegalItem()
	 * @generated
	 * @ordered
	 */
	protected static final String ILLEGAL_ITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIllegalItem() <em>Illegal Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIllegalItem()
	 * @generated
	 * @ordered
	 */
	protected String illegalItem = ILLEGAL_ITEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IllegalCompositionExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getIllegalCompositionException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemType getIllegalItemType() {
		return illegalItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIllegalItemType(ItemType newIllegalItemType) {
		ItemType oldIllegalItemType = illegalItemType;
		illegalItemType = newIllegalItemType == null ? ILLEGAL_ITEM_TYPE_EDEFAULT : newIllegalItemType;
		boolean oldIllegalItemTypeESet = illegalItemTypeESet;
		illegalItemTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__ILLEGAL_ITEM_TYPE, oldIllegalItemType, illegalItemType, !oldIllegalItemTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIllegalItemType() {
		ItemType oldIllegalItemType = illegalItemType;
		boolean oldIllegalItemTypeESet = illegalItemTypeESet;
		illegalItemType = ILLEGAL_ITEM_TYPE_EDEFAULT;
		illegalItemTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__ILLEGAL_ITEM_TYPE, oldIllegalItemType, ILLEGAL_ITEM_TYPE_EDEFAULT, oldIllegalItemTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIllegalItemType() {
		return illegalItemTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIllegalItem() {
		return illegalItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIllegalItem(String newIllegalItem) {
		String oldIllegalItem = illegalItem;
		illegalItem = newIllegalItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__ILLEGAL_ITEM, oldIllegalItem, illegalItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__ILLEGAL_ITEM_TYPE:
				return getIllegalItemType();
			case Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__ILLEGAL_ITEM:
				return getIllegalItem();
			case Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__MESSAGE:
				return getMessage();
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
			case Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__ILLEGAL_ITEM_TYPE:
				setIllegalItemType((ItemType)newValue);
				return;
			case Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__ILLEGAL_ITEM:
				setIllegalItem((String)newValue);
				return;
			case Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__MESSAGE:
				setMessage((String)newValue);
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
			case Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__ILLEGAL_ITEM_TYPE:
				unsetIllegalItemType();
				return;
			case Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__ILLEGAL_ITEM:
				setIllegalItem(ILLEGAL_ITEM_EDEFAULT);
				return;
			case Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
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
			case Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__ILLEGAL_ITEM_TYPE:
				return isSetIllegalItemType();
			case Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__ILLEGAL_ITEM:
				return ILLEGAL_ITEM_EDEFAULT == null ? illegalItem != null : !ILLEGAL_ITEM_EDEFAULT.equals(illegalItem);
			case Cm2Package.ILLEGAL_COMPOSITION_EXCEPTION__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
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
		result.append(" (illegalItemType: ");
		if (illegalItemTypeESet) result.append(illegalItemType); else result.append("<unset>");
		result.append(", illegalItem: ");
		result.append(illegalItem);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //IllegalCompositionExceptionImpl
