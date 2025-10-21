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
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.IdentifikationObjektType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifikation Objekt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.IdentifikationObjektTypeImpl#getXdomeaUUID <em>Xdomea UUID</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.IdentifikationObjektTypeImpl#getNummerImUebergeordnetenContainer <em>Nummer Im Uebergeordneten Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifikationObjektTypeImpl extends MinimalEObjectImpl.Container implements IdentifikationObjektType {
	/**
	 * The default value of the '{@link #getXdomeaUUID() <em>Xdomea UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXdomeaUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String XDOMEA_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXdomeaUUID() <em>Xdomea UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXdomeaUUID()
	 * @generated
	 * @ordered
	 */
	protected String xdomeaUUID = XDOMEA_UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNummerImUebergeordnetenContainer() <em>Nummer Im Uebergeordneten Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNummerImUebergeordnetenContainer()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMMER_IM_UEBERGEORDNETEN_CONTAINER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNummerImUebergeordnetenContainer() <em>Nummer Im Uebergeordneten Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNummerImUebergeordnetenContainer()
	 * @generated
	 * @ordered
	 */
	protected long nummerImUebergeordnetenContainer = NUMMER_IM_UEBERGEORDNETEN_CONTAINER_EDEFAULT;

	/**
	 * This is true if the Nummer Im Uebergeordneten Container attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nummerImUebergeordnetenContainerESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifikationObjektTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.IDENTIFIKATION_OBJEKT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXdomeaUUID() {
		return xdomeaUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXdomeaUUID(String newXdomeaUUID) {
		String oldXdomeaUUID = xdomeaUUID;
		xdomeaUUID = newXdomeaUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.IDENTIFIKATION_OBJEKT_TYPE__XDOMEA_UUID, oldXdomeaUUID, xdomeaUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNummerImUebergeordnetenContainer() {
		return nummerImUebergeordnetenContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNummerImUebergeordnetenContainer(long newNummerImUebergeordnetenContainer) {
		long oldNummerImUebergeordnetenContainer = nummerImUebergeordnetenContainer;
		nummerImUebergeordnetenContainer = newNummerImUebergeordnetenContainer;
		boolean oldNummerImUebergeordnetenContainerESet = nummerImUebergeordnetenContainerESet;
		nummerImUebergeordnetenContainerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.IDENTIFIKATION_OBJEKT_TYPE__NUMMER_IM_UEBERGEORDNETEN_CONTAINER, oldNummerImUebergeordnetenContainer, nummerImUebergeordnetenContainer, !oldNummerImUebergeordnetenContainerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNummerImUebergeordnetenContainer() {
		long oldNummerImUebergeordnetenContainer = nummerImUebergeordnetenContainer;
		boolean oldNummerImUebergeordnetenContainerESet = nummerImUebergeordnetenContainerESet;
		nummerImUebergeordnetenContainer = NUMMER_IM_UEBERGEORDNETEN_CONTAINER_EDEFAULT;
		nummerImUebergeordnetenContainerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DomeaPackage.IDENTIFIKATION_OBJEKT_TYPE__NUMMER_IM_UEBERGEORDNETEN_CONTAINER, oldNummerImUebergeordnetenContainer, NUMMER_IM_UEBERGEORDNETEN_CONTAINER_EDEFAULT, oldNummerImUebergeordnetenContainerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNummerImUebergeordnetenContainer() {
		return nummerImUebergeordnetenContainerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomeaPackage.IDENTIFIKATION_OBJEKT_TYPE__XDOMEA_UUID:
				return getXdomeaUUID();
			case DomeaPackage.IDENTIFIKATION_OBJEKT_TYPE__NUMMER_IM_UEBERGEORDNETEN_CONTAINER:
				return getNummerImUebergeordnetenContainer();
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
			case DomeaPackage.IDENTIFIKATION_OBJEKT_TYPE__XDOMEA_UUID:
				setXdomeaUUID((String)newValue);
				return;
			case DomeaPackage.IDENTIFIKATION_OBJEKT_TYPE__NUMMER_IM_UEBERGEORDNETEN_CONTAINER:
				setNummerImUebergeordnetenContainer((Long)newValue);
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
			case DomeaPackage.IDENTIFIKATION_OBJEKT_TYPE__XDOMEA_UUID:
				setXdomeaUUID(XDOMEA_UUID_EDEFAULT);
				return;
			case DomeaPackage.IDENTIFIKATION_OBJEKT_TYPE__NUMMER_IM_UEBERGEORDNETEN_CONTAINER:
				unsetNummerImUebergeordnetenContainer();
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
			case DomeaPackage.IDENTIFIKATION_OBJEKT_TYPE__XDOMEA_UUID:
				return XDOMEA_UUID_EDEFAULT == null ? xdomeaUUID != null : !XDOMEA_UUID_EDEFAULT.equals(xdomeaUUID);
			case DomeaPackage.IDENTIFIKATION_OBJEKT_TYPE__NUMMER_IM_UEBERGEORDNETEN_CONTAINER:
				return isSetNummerImUebergeordnetenContainer();
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
		result.append(" (xdomeaUUID: ");
		result.append(xdomeaUUID);
		result.append(", nummerImUebergeordnetenContainer: ");
		if (nummerImUebergeordnetenContainerESet) result.append(nummerImUebergeordnetenContainer); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IdentifikationObjektTypeImpl
