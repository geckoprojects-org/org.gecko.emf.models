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
import de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kommunikationspartner Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.KommunikationspartnerTypeImpl#getBehoerdenkennung <em>Behoerdenkennung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.KommunikationspartnerTypeImpl#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.KommunikationspartnerTypeImpl#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.KommunikationspartnerTypeImpl#getBehoerdenname <em>Behoerdenname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KommunikationspartnerTypeImpl extends MinimalEObjectImpl.Container implements KommunikationspartnerType {
	/**
	 * The cached value of the '{@link #getBehoerdenkennung() <em>Behoerdenkennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehoerdenkennung()
	 * @generated
	 * @ordered
	 */
	protected BehoerdenkennungType behoerdenkennung;

	/**
	 * The cached value of the '{@link #getErreichbarkeit() <em>Erreichbarkeit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErreichbarkeit()
	 * @generated
	 * @ordered
	 */
	protected EList<ErreichbarkeitType> erreichbarkeit;

	/**
	 * The cached value of the '{@link #getAnschrift() <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftType anschrift;

	/**
	 * The default value of the '{@link #getBehoerdenname() <em>Behoerdenname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehoerdenname()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHOERDENNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBehoerdenname() <em>Behoerdenname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehoerdenname()
	 * @generated
	 * @ordered
	 */
	protected String behoerdenname = BEHOERDENNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KommunikationspartnerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.KOMMUNIKATIONSPARTNER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehoerdenkennungType getBehoerdenkennung() {
		return behoerdenkennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehoerdenkennung(BehoerdenkennungType newBehoerdenkennung, NotificationChain msgs) {
		BehoerdenkennungType oldBehoerdenkennung = behoerdenkennung;
		behoerdenkennung = newBehoerdenkennung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENKENNUNG, oldBehoerdenkennung, newBehoerdenkennung);
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
	public void setBehoerdenkennung(BehoerdenkennungType newBehoerdenkennung) {
		if (newBehoerdenkennung != behoerdenkennung) {
			NotificationChain msgs = null;
			if (behoerdenkennung != null)
				msgs = ((InternalEObject)behoerdenkennung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENKENNUNG, null, msgs);
			if (newBehoerdenkennung != null)
				msgs = ((InternalEObject)newBehoerdenkennung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENKENNUNG, null, msgs);
			msgs = basicSetBehoerdenkennung(newBehoerdenkennung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENKENNUNG, newBehoerdenkennung, newBehoerdenkennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErreichbarkeitType> getErreichbarkeit() {
		if (erreichbarkeit == null) {
			erreichbarkeit = new EObjectContainmentEList<ErreichbarkeitType>(ErreichbarkeitType.class, this, BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__ERREICHBARKEIT);
		}
		return erreichbarkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftType getAnschrift() {
		return anschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschrift(PostalischeInlandsanschriftType newAnschrift, NotificationChain msgs) {
		PostalischeInlandsanschriftType oldAnschrift = anschrift;
		anschrift = newAnschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__ANSCHRIFT, oldAnschrift, newAnschrift);
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
	public void setAnschrift(PostalischeInlandsanschriftType newAnschrift) {
		if (newAnschrift != anschrift) {
			NotificationChain msgs = null;
			if (anschrift != null)
				msgs = ((InternalEObject)anschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__ANSCHRIFT, null, msgs);
			if (newAnschrift != null)
				msgs = ((InternalEObject)newAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__ANSCHRIFT, null, msgs);
			msgs = basicSetAnschrift(newAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__ANSCHRIFT, newAnschrift, newAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBehoerdenname() {
		return behoerdenname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBehoerdenname(String newBehoerdenname) {
		String oldBehoerdenname = behoerdenname;
		behoerdenname = newBehoerdenname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENNAME, oldBehoerdenname, behoerdenname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENKENNUNG:
				return basicSetBehoerdenkennung(null, msgs);
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__ERREICHBARKEIT:
				return ((InternalEList<?>)getErreichbarkeit()).basicRemove(otherEnd, msgs);
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__ANSCHRIFT:
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
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENKENNUNG:
				return getBehoerdenkennung();
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__ERREICHBARKEIT:
				return getErreichbarkeit();
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__ANSCHRIFT:
				return getAnschrift();
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENNAME:
				return getBehoerdenname();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENKENNUNG:
				setBehoerdenkennung((BehoerdenkennungType)newValue);
				return;
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__ERREICHBARKEIT:
				getErreichbarkeit().clear();
				getErreichbarkeit().addAll((Collection<? extends ErreichbarkeitType>)newValue);
				return;
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__ANSCHRIFT:
				setAnschrift((PostalischeInlandsanschriftType)newValue);
				return;
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENNAME:
				setBehoerdenname((String)newValue);
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
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENKENNUNG:
				setBehoerdenkennung((BehoerdenkennungType)null);
				return;
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__ERREICHBARKEIT:
				getErreichbarkeit().clear();
				return;
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__ANSCHRIFT:
				setAnschrift((PostalischeInlandsanschriftType)null);
				return;
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENNAME:
				setBehoerdenname(BEHOERDENNAME_EDEFAULT);
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
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENKENNUNG:
				return behoerdenkennung != null;
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__ERREICHBARKEIT:
				return erreichbarkeit != null && !erreichbarkeit.isEmpty();
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__ANSCHRIFT:
				return anschrift != null;
			case BaukastenPackage.KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENNAME:
				return BEHOERDENNAME_EDEFAULT == null ? behoerdenname != null : !BEHOERDENNAME_EDEFAULT.equals(behoerdenname);
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
		result.append(" (behoerdenname: ");
		result.append(behoerdenname);
		result.append(')');
		return result.toString();
	}

} //KommunikationspartnerTypeImpl
