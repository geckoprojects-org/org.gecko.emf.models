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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.RechtsanwaltType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rechtsanwalt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.RechtsanwaltTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.RechtsanwaltTypeImpl#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.RechtsanwaltTypeImpl#getAktenzeichen <em>Aktenzeichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.RechtsanwaltTypeImpl#isBeauftragtGeltungsmachungUVanspruch <em>Beauftragt Geltungsmachung UVanspruch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RechtsanwaltTypeImpl extends MinimalEObjectImpl.Container implements RechtsanwaltType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonType name;

	/**
	 * The cached value of the '{@link #getAnschrift() <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType anschrift;

	/**
	 * The default value of the '{@link #getAktenzeichen() <em>Aktenzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichen()
	 * @generated
	 * @ordered
	 */
	protected static final String AKTENZEICHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAktenzeichen() <em>Aktenzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichen()
	 * @generated
	 * @ordered
	 */
	protected String aktenzeichen = AKTENZEICHEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isBeauftragtGeltungsmachungUVanspruch() <em>Beauftragt Geltungsmachung UVanspruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeauftragtGeltungsmachungUVanspruch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBeauftragtGeltungsmachungUVanspruch() <em>Beauftragt Geltungsmachung UVanspruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeauftragtGeltungsmachungUVanspruch()
	 * @generated
	 * @ordered
	 */
	protected boolean beauftragtGeltungsmachungUVanspruch = BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH_EDEFAULT;

	/**
	 * This is true if the Beauftragt Geltungsmachung UVanspruch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean beauftragtGeltungsmachungUVanspruchESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RechtsanwaltTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getRechtsanwaltType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameNatuerlichePersonType newName, NotificationChain msgs) {
		NameNatuerlichePersonType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__NAME, oldName, newName);
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
	public void setName(NameNatuerlichePersonType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType getAnschrift() {
		return anschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschrift(PostalischeInlandsanschriftBasisType newAnschrift, NotificationChain msgs) {
		PostalischeInlandsanschriftBasisType oldAnschrift = anschrift;
		anschrift = newAnschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__ANSCHRIFT, oldAnschrift, newAnschrift);
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
	public void setAnschrift(PostalischeInlandsanschriftBasisType newAnschrift) {
		if (newAnschrift != anschrift) {
			NotificationChain msgs = null;
			if (anschrift != null)
				msgs = ((InternalEObject)anschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__ANSCHRIFT, null, msgs);
			if (newAnschrift != null)
				msgs = ((InternalEObject)newAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__ANSCHRIFT, null, msgs);
			msgs = basicSetAnschrift(newAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__ANSCHRIFT, newAnschrift, newAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAktenzeichen() {
		return aktenzeichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAktenzeichen(String newAktenzeichen) {
		String oldAktenzeichen = aktenzeichen;
		aktenzeichen = newAktenzeichen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__AKTENZEICHEN, oldAktenzeichen, aktenzeichen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBeauftragtGeltungsmachungUVanspruch() {
		return beauftragtGeltungsmachungUVanspruch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeauftragtGeltungsmachungUVanspruch(boolean newBeauftragtGeltungsmachungUVanspruch) {
		boolean oldBeauftragtGeltungsmachungUVanspruch = beauftragtGeltungsmachungUVanspruch;
		beauftragtGeltungsmachungUVanspruch = newBeauftragtGeltungsmachungUVanspruch;
		boolean oldBeauftragtGeltungsmachungUVanspruchESet = beauftragtGeltungsmachungUVanspruchESet;
		beauftragtGeltungsmachungUVanspruchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH, oldBeauftragtGeltungsmachungUVanspruch, beauftragtGeltungsmachungUVanspruch, !oldBeauftragtGeltungsmachungUVanspruchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBeauftragtGeltungsmachungUVanspruch() {
		boolean oldBeauftragtGeltungsmachungUVanspruch = beauftragtGeltungsmachungUVanspruch;
		boolean oldBeauftragtGeltungsmachungUVanspruchESet = beauftragtGeltungsmachungUVanspruchESet;
		beauftragtGeltungsmachungUVanspruch = BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH_EDEFAULT;
		beauftragtGeltungsmachungUVanspruchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH, oldBeauftragtGeltungsmachungUVanspruch, BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH_EDEFAULT, oldBeauftragtGeltungsmachungUVanspruchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBeauftragtGeltungsmachungUVanspruch() {
		return beauftragtGeltungsmachungUVanspruchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__NAME:
				return basicSetName(null, msgs);
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__ANSCHRIFT:
				return basicSetAnschrift(null, msgs);
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
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__NAME:
				return getName();
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__ANSCHRIFT:
				return getAnschrift();
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__AKTENZEICHEN:
				return getAktenzeichen();
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH:
				return isBeauftragtGeltungsmachungUVanspruch();
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
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__NAME:
				setName((NameNatuerlichePersonType)newValue);
				return;
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__ANSCHRIFT:
				setAnschrift((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__AKTENZEICHEN:
				setAktenzeichen((String)newValue);
				return;
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH:
				setBeauftragtGeltungsmachungUVanspruch((Boolean)newValue);
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
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__NAME:
				setName((NameNatuerlichePersonType)null);
				return;
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__ANSCHRIFT:
				setAnschrift((PostalischeInlandsanschriftBasisType)null);
				return;
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__AKTENZEICHEN:
				setAktenzeichen(AKTENZEICHEN_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH:
				unsetBeauftragtGeltungsmachungUVanspruch();
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
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__NAME:
				return name != null;
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__ANSCHRIFT:
				return anschrift != null;
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__AKTENZEICHEN:
				return AKTENZEICHEN_EDEFAULT == null ? aktenzeichen != null : !AKTENZEICHEN_EDEFAULT.equals(aktenzeichen);
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE__BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH:
				return isSetBeauftragtGeltungsmachungUVanspruch();
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
		result.append(" (aktenzeichen: ");
		result.append(aktenzeichen);
		result.append(", beauftragtGeltungsmachungUVanspruch: ");
		if (beauftragtGeltungsmachungUVanspruchESet) result.append(beauftragtGeltungsmachungUVanspruch); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RechtsanwaltTypeImpl
