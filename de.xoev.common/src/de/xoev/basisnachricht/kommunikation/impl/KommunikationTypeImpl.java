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
package de.xoev.basisnachricht.kommunikation.impl;

import de.xoev.basisnachricht.kommunikation.CodeKommunikationKanalType;
import de.xoev.basisnachricht.kommunikation.KommunikationPackage;
import de.xoev.basisnachricht.kommunikation.KommunikationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.basisnachricht.kommunikation.impl.KommunikationTypeImpl#getKanal <em>Kanal</em>}</li>
 *   <li>{@link de.xoev.basisnachricht.kommunikation.impl.KommunikationTypeImpl#getKennung <em>Kennung</em>}</li>
 *   <li>{@link de.xoev.basisnachricht.kommunikation.impl.KommunikationTypeImpl#getZusatz <em>Zusatz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KommunikationTypeImpl extends MinimalEObjectImpl.Container implements KommunikationType {
	/**
	 * The cached value of the '{@link #getKanal() <em>Kanal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKanal()
	 * @generated
	 * @ordered
	 */
	protected CodeKommunikationKanalType kanal;

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
	protected KommunikationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KommunikationPackage.Literals.KOMMUNIKATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKommunikationKanalType getKanal() {
		return kanal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKanal(CodeKommunikationKanalType newKanal, NotificationChain msgs) {
		CodeKommunikationKanalType oldKanal = kanal;
		kanal = newKanal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KommunikationPackage.KOMMUNIKATION_TYPE__KANAL, oldKanal, newKanal);
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
	public void setKanal(CodeKommunikationKanalType newKanal) {
		if (newKanal != kanal) {
			NotificationChain msgs = null;
			if (kanal != null)
				msgs = ((InternalEObject)kanal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KommunikationPackage.KOMMUNIKATION_TYPE__KANAL, null, msgs);
			if (newKanal != null)
				msgs = ((InternalEObject)newKanal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KommunikationPackage.KOMMUNIKATION_TYPE__KANAL, null, msgs);
			msgs = basicSetKanal(newKanal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KommunikationPackage.KOMMUNIKATION_TYPE__KANAL, newKanal, newKanal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KommunikationPackage.KOMMUNIKATION_TYPE__KENNUNG, oldKennung, kennung));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KommunikationPackage.KOMMUNIKATION_TYPE__ZUSATZ, oldZusatz, zusatz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KommunikationPackage.KOMMUNIKATION_TYPE__KANAL:
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
			case KommunikationPackage.KOMMUNIKATION_TYPE__KANAL:
				return getKanal();
			case KommunikationPackage.KOMMUNIKATION_TYPE__KENNUNG:
				return getKennung();
			case KommunikationPackage.KOMMUNIKATION_TYPE__ZUSATZ:
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
			case KommunikationPackage.KOMMUNIKATION_TYPE__KANAL:
				setKanal((CodeKommunikationKanalType)newValue);
				return;
			case KommunikationPackage.KOMMUNIKATION_TYPE__KENNUNG:
				setKennung((String)newValue);
				return;
			case KommunikationPackage.KOMMUNIKATION_TYPE__ZUSATZ:
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
			case KommunikationPackage.KOMMUNIKATION_TYPE__KANAL:
				setKanal((CodeKommunikationKanalType)null);
				return;
			case KommunikationPackage.KOMMUNIKATION_TYPE__KENNUNG:
				setKennung(KENNUNG_EDEFAULT);
				return;
			case KommunikationPackage.KOMMUNIKATION_TYPE__ZUSATZ:
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
			case KommunikationPackage.KOMMUNIKATION_TYPE__KANAL:
				return kanal != null;
			case KommunikationPackage.KOMMUNIKATION_TYPE__KENNUNG:
				return KENNUNG_EDEFAULT == null ? kennung != null : !KENNUNG_EDEFAULT.equals(kennung);
			case KommunikationPackage.KOMMUNIKATION_TYPE__ZUSATZ:
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

} //KommunikationTypeImpl
