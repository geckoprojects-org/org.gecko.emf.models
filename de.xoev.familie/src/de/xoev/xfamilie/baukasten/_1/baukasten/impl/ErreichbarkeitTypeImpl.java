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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erreichbarkeit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ErreichbarkeitTypeImpl#getKanal <em>Kanal</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ErreichbarkeitTypeImpl#getKennung <em>Kennung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ErreichbarkeitTypeImpl#getZusatz <em>Zusatz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErreichbarkeitTypeImpl extends MinimalEObjectImpl.Container implements ErreichbarkeitType {
	/**
	 * The cached value of the '{@link #getKanal() <em>Kanal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKanal()
	 * @generated
	 * @ordered
	 */
	protected CodeErreichbarkeitType kanal;

	/**
	 * The default value of the '{@link #getKennung() <em>Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennung()
	 * @generated
	 * @ordered
	 */
	protected static final String KENNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKennung() <em>Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennung()
	 * @generated
	 * @ordered
	 */
	protected String kennung = KENNUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getZusatz() <em>Zusatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatz()
	 * @generated
	 * @ordered
	 */
	protected static final String ZUSATZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZusatz() <em>Zusatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatz()
	 * @generated
	 * @ordered
	 */
	protected String zusatz = ZUSATZ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErreichbarkeitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.ERREICHBARKEIT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeErreichbarkeitType getKanal() {
		return kanal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKanal(CodeErreichbarkeitType newKanal, NotificationChain msgs) {
		CodeErreichbarkeitType oldKanal = kanal;
		kanal = newKanal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.ERREICHBARKEIT_TYPE__KANAL, oldKanal, newKanal);
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
	public void setKanal(CodeErreichbarkeitType newKanal) {
		if (newKanal != kanal) {
			NotificationChain msgs = null;
			if (kanal != null)
				msgs = ((InternalEObject)kanal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.ERREICHBARKEIT_TYPE__KANAL, null, msgs);
			if (newKanal != null)
				msgs = ((InternalEObject)newKanal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.ERREICHBARKEIT_TYPE__KANAL, null, msgs);
			msgs = basicSetKanal(newKanal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ERREICHBARKEIT_TYPE__KANAL, newKanal, newKanal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKennung() {
		return kennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKennung(String newKennung) {
		String oldKennung = kennung;
		kennung = newKennung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ERREICHBARKEIT_TYPE__KENNUNG, oldKennung, kennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZusatz() {
		return zusatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZusatz(String newZusatz) {
		String oldZusatz = zusatz;
		zusatz = newZusatz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ERREICHBARKEIT_TYPE__ZUSATZ, oldZusatz, zusatz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.ERREICHBARKEIT_TYPE__KANAL:
				return basicSetKanal(null, msgs);
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
			case BaukastenPackage.ERREICHBARKEIT_TYPE__KANAL:
				return getKanal();
			case BaukastenPackage.ERREICHBARKEIT_TYPE__KENNUNG:
				return getKennung();
			case BaukastenPackage.ERREICHBARKEIT_TYPE__ZUSATZ:
				return getZusatz();
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
			case BaukastenPackage.ERREICHBARKEIT_TYPE__KANAL:
				setKanal((CodeErreichbarkeitType)newValue);
				return;
			case BaukastenPackage.ERREICHBARKEIT_TYPE__KENNUNG:
				setKennung((String)newValue);
				return;
			case BaukastenPackage.ERREICHBARKEIT_TYPE__ZUSATZ:
				setZusatz((String)newValue);
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
			case BaukastenPackage.ERREICHBARKEIT_TYPE__KANAL:
				setKanal((CodeErreichbarkeitType)null);
				return;
			case BaukastenPackage.ERREICHBARKEIT_TYPE__KENNUNG:
				setKennung(KENNUNG_EDEFAULT);
				return;
			case BaukastenPackage.ERREICHBARKEIT_TYPE__ZUSATZ:
				setZusatz(ZUSATZ_EDEFAULT);
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
			case BaukastenPackage.ERREICHBARKEIT_TYPE__KANAL:
				return kanal != null;
			case BaukastenPackage.ERREICHBARKEIT_TYPE__KENNUNG:
				return KENNUNG_EDEFAULT == null ? kennung != null : !KENNUNG_EDEFAULT.equals(kennung);
			case BaukastenPackage.ERREICHBARKEIT_TYPE__ZUSATZ:
				return ZUSATZ_EDEFAULT == null ? zusatz != null : !ZUSATZ_EDEFAULT.equals(zusatz);
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
		result.append(" (kennung: ");
		result.append(kennung);
		result.append(", zusatz: ");
		result.append(zusatz);
		result.append(')');
		return result.toString();
	}

} //ErreichbarkeitTypeImpl
