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
import de.xoev.domea.domea.HashType;
import de.xoev.domea.domea.KryptographischeAlgorithmenCodeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hash Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.HashTypeImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.HashTypeImpl#getAlgorithmus <em>Algorithmus</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.HashTypeImpl#getSonstigerAlgorithmus <em>Sonstiger Algorithmus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HashTypeImpl extends MinimalEObjectImpl.Container implements HashType {
	/**
	 * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected static final String WERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected String wert = WERT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlgorithmus() <em>Algorithmus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmus()
	 * @generated
	 * @ordered
	 */
	protected KryptographischeAlgorithmenCodeType algorithmus;

	/**
	 * The default value of the '{@link #getSonstigerAlgorithmus() <em>Sonstiger Algorithmus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSonstigerAlgorithmus()
	 * @generated
	 * @ordered
	 */
	protected static final String SONSTIGER_ALGORITHMUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSonstigerAlgorithmus() <em>Sonstiger Algorithmus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSonstigerAlgorithmus()
	 * @generated
	 * @ordered
	 */
	protected String sonstigerAlgorithmus = SONSTIGER_ALGORITHMUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.HASH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWert() {
		return wert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWert(String newWert) {
		String oldWert = wert;
		wert = newWert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.HASH_TYPE__WERT, oldWert, wert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KryptographischeAlgorithmenCodeType getAlgorithmus() {
		return algorithmus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgorithmus(KryptographischeAlgorithmenCodeType newAlgorithmus, NotificationChain msgs) {
		KryptographischeAlgorithmenCodeType oldAlgorithmus = algorithmus;
		algorithmus = newAlgorithmus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.HASH_TYPE__ALGORITHMUS, oldAlgorithmus, newAlgorithmus);
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
	public void setAlgorithmus(KryptographischeAlgorithmenCodeType newAlgorithmus) {
		if (newAlgorithmus != algorithmus) {
			NotificationChain msgs = null;
			if (algorithmus != null)
				msgs = ((InternalEObject)algorithmus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.HASH_TYPE__ALGORITHMUS, null, msgs);
			if (newAlgorithmus != null)
				msgs = ((InternalEObject)newAlgorithmus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.HASH_TYPE__ALGORITHMUS, null, msgs);
			msgs = basicSetAlgorithmus(newAlgorithmus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.HASH_TYPE__ALGORITHMUS, newAlgorithmus, newAlgorithmus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSonstigerAlgorithmus() {
		return sonstigerAlgorithmus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSonstigerAlgorithmus(String newSonstigerAlgorithmus) {
		String oldSonstigerAlgorithmus = sonstigerAlgorithmus;
		sonstigerAlgorithmus = newSonstigerAlgorithmus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.HASH_TYPE__SONSTIGER_ALGORITHMUS, oldSonstigerAlgorithmus, sonstigerAlgorithmus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.HASH_TYPE__ALGORITHMUS:
				return basicSetAlgorithmus(null, msgs);
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
			case DomeaPackage.HASH_TYPE__WERT:
				return getWert();
			case DomeaPackage.HASH_TYPE__ALGORITHMUS:
				return getAlgorithmus();
			case DomeaPackage.HASH_TYPE__SONSTIGER_ALGORITHMUS:
				return getSonstigerAlgorithmus();
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
			case DomeaPackage.HASH_TYPE__WERT:
				setWert((String)newValue);
				return;
			case DomeaPackage.HASH_TYPE__ALGORITHMUS:
				setAlgorithmus((KryptographischeAlgorithmenCodeType)newValue);
				return;
			case DomeaPackage.HASH_TYPE__SONSTIGER_ALGORITHMUS:
				setSonstigerAlgorithmus((String)newValue);
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
			case DomeaPackage.HASH_TYPE__WERT:
				setWert(WERT_EDEFAULT);
				return;
			case DomeaPackage.HASH_TYPE__ALGORITHMUS:
				setAlgorithmus((KryptographischeAlgorithmenCodeType)null);
				return;
			case DomeaPackage.HASH_TYPE__SONSTIGER_ALGORITHMUS:
				setSonstigerAlgorithmus(SONSTIGER_ALGORITHMUS_EDEFAULT);
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
			case DomeaPackage.HASH_TYPE__WERT:
				return WERT_EDEFAULT == null ? wert != null : !WERT_EDEFAULT.equals(wert);
			case DomeaPackage.HASH_TYPE__ALGORITHMUS:
				return algorithmus != null;
			case DomeaPackage.HASH_TYPE__SONSTIGER_ALGORITHMUS:
				return SONSTIGER_ALGORITHMUS_EDEFAULT == null ? sonstigerAlgorithmus != null : !SONSTIGER_ALGORITHMUS_EDEFAULT.equals(sonstigerAlgorithmus);
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
		result.append(" (wert: ");
		result.append(wert);
		result.append(", sonstigerAlgorithmus: ");
		result.append(sonstigerAlgorithmus);
		result.append(')');
		return result.toString();
	}

} //HashTypeImpl
