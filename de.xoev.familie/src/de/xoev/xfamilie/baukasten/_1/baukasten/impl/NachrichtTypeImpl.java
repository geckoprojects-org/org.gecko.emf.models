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
import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType;
import de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType;

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
 * An implementation of the model object '<em><b>Nachricht Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl#getNachrichtenkopf <em>Nachrichtenkopf</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl#getZusatzparametergruppe <em>Zusatzparametergruppe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl#getProdukt <em>Produkt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl#getProdukthersteller <em>Produkthersteller</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl#getProduktversion <em>Produktversion</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl#getStandard <em>Standard</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl#getTest <em>Test</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachrichtTypeImpl extends MinimalEObjectImpl.Container implements NachrichtType {
	/**
	 * The cached value of the '{@link #getNachrichtenkopf() <em>Nachrichtenkopf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachrichtenkopf()
	 * @generated
	 * @ordered
	 */
	protected NachrichtenkopfType nachrichtenkopf;

	/**
	 * The cached value of the '{@link #getZusatzparametergruppe() <em>Zusatzparametergruppe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatzparametergruppe()
	 * @generated
	 * @ordered
	 */
	protected EList<ZusatzparametergruppeType> zusatzparametergruppe;

	/**
	 * The default value of the '{@link #getProdukt() <em>Produkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdukt()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUKT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProdukt() <em>Produkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdukt()
	 * @generated
	 * @ordered
	 */
	protected String produkt = PRODUKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProdukthersteller() <em>Produkthersteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdukthersteller()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUKTHERSTELLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProdukthersteller() <em>Produkthersteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdukthersteller()
	 * @generated
	 * @ordered
	 */
	protected String produkthersteller = PRODUKTHERSTELLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProduktversion() <em>Produktversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduktversion()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUKTVERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProduktversion() <em>Produktversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduktversion()
	 * @generated
	 * @ordered
	 */
	protected String produktversion = PRODUKTVERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandard() <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_EDEFAULT = "XFamilie";

	/**
	 * The cached value of the '{@link #getStandard() <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected String standard = STANDARD_EDEFAULT;

	/**
	 * This is true if the Standard attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean standardESet;

	/**
	 * The default value of the '{@link #getTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected String test = TEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachrichtTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.NACHRICHT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachrichtenkopfType getNachrichtenkopf() {
		return nachrichtenkopf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachrichtenkopf(NachrichtenkopfType newNachrichtenkopf, NotificationChain msgs) {
		NachrichtenkopfType oldNachrichtenkopf = nachrichtenkopf;
		nachrichtenkopf = newNachrichtenkopf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF, oldNachrichtenkopf, newNachrichtenkopf);
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
	public void setNachrichtenkopf(NachrichtenkopfType newNachrichtenkopf) {
		if (newNachrichtenkopf != nachrichtenkopf) {
			NotificationChain msgs = null;
			if (nachrichtenkopf != null)
				msgs = ((InternalEObject)nachrichtenkopf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF, null, msgs);
			if (newNachrichtenkopf != null)
				msgs = ((InternalEObject)newNachrichtenkopf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF, null, msgs);
			msgs = basicSetNachrichtenkopf(newNachrichtenkopf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF, newNachrichtenkopf, newNachrichtenkopf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZusatzparametergruppeType> getZusatzparametergruppe() {
		if (zusatzparametergruppe == null) {
			zusatzparametergruppe = new EObjectContainmentEList<ZusatzparametergruppeType>(ZusatzparametergruppeType.class, this, BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE);
		}
		return zusatzparametergruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProdukt() {
		return produkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdukt(String newProdukt) {
		String oldProdukt = produkt;
		produkt = newProdukt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHT_TYPE__PRODUKT, oldProdukt, produkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProdukthersteller() {
		return produkthersteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdukthersteller(String newProdukthersteller) {
		String oldProdukthersteller = produkthersteller;
		produkthersteller = newProdukthersteller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER, oldProdukthersteller, produkthersteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProduktversion() {
		return produktversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduktversion(String newProduktversion) {
		String oldProduktversion = produktversion;
		produktversion = newProduktversion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION, oldProduktversion, produktversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStandard() {
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandard(String newStandard) {
		String oldStandard = standard;
		standard = newStandard;
		boolean oldStandardESet = standardESet;
		standardESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHT_TYPE__STANDARD, oldStandard, standard, !oldStandardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStandard() {
		String oldStandard = standard;
		boolean oldStandardESet = standardESet;
		standard = STANDARD_EDEFAULT;
		standardESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BaukastenPackage.NACHRICHT_TYPE__STANDARD, oldStandard, STANDARD_EDEFAULT, oldStandardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStandard() {
		return standardESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTest() {
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTest(String newTest) {
		String oldTest = test;
		test = newTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHT_TYPE__TEST, oldTest, test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHRICHT_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF:
				return basicSetNachrichtenkopf(null, msgs);
			case BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE:
				return ((InternalEList<?>)getZusatzparametergruppe()).basicRemove(otherEnd, msgs);
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
			case BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF:
				return getNachrichtenkopf();
			case BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE:
				return getZusatzparametergruppe();
			case BaukastenPackage.NACHRICHT_TYPE__PRODUKT:
				return getProdukt();
			case BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER:
				return getProdukthersteller();
			case BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION:
				return getProduktversion();
			case BaukastenPackage.NACHRICHT_TYPE__STANDARD:
				return getStandard();
			case BaukastenPackage.NACHRICHT_TYPE__TEST:
				return getTest();
			case BaukastenPackage.NACHRICHT_TYPE__VERSION:
				return getVersion();
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
			case BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF:
				setNachrichtenkopf((NachrichtenkopfType)newValue);
				return;
			case BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE:
				getZusatzparametergruppe().clear();
				getZusatzparametergruppe().addAll((Collection<? extends ZusatzparametergruppeType>)newValue);
				return;
			case BaukastenPackage.NACHRICHT_TYPE__PRODUKT:
				setProdukt((String)newValue);
				return;
			case BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER:
				setProdukthersteller((String)newValue);
				return;
			case BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION:
				setProduktversion((String)newValue);
				return;
			case BaukastenPackage.NACHRICHT_TYPE__STANDARD:
				setStandard((String)newValue);
				return;
			case BaukastenPackage.NACHRICHT_TYPE__TEST:
				setTest((String)newValue);
				return;
			case BaukastenPackage.NACHRICHT_TYPE__VERSION:
				setVersion((String)newValue);
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
			case BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF:
				setNachrichtenkopf((NachrichtenkopfType)null);
				return;
			case BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE:
				getZusatzparametergruppe().clear();
				return;
			case BaukastenPackage.NACHRICHT_TYPE__PRODUKT:
				setProdukt(PRODUKT_EDEFAULT);
				return;
			case BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER:
				setProdukthersteller(PRODUKTHERSTELLER_EDEFAULT);
				return;
			case BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION:
				setProduktversion(PRODUKTVERSION_EDEFAULT);
				return;
			case BaukastenPackage.NACHRICHT_TYPE__STANDARD:
				unsetStandard();
				return;
			case BaukastenPackage.NACHRICHT_TYPE__TEST:
				setTest(TEST_EDEFAULT);
				return;
			case BaukastenPackage.NACHRICHT_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF:
				return nachrichtenkopf != null;
			case BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE:
				return zusatzparametergruppe != null && !zusatzparametergruppe.isEmpty();
			case BaukastenPackage.NACHRICHT_TYPE__PRODUKT:
				return PRODUKT_EDEFAULT == null ? produkt != null : !PRODUKT_EDEFAULT.equals(produkt);
			case BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER:
				return PRODUKTHERSTELLER_EDEFAULT == null ? produkthersteller != null : !PRODUKTHERSTELLER_EDEFAULT.equals(produkthersteller);
			case BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION:
				return PRODUKTVERSION_EDEFAULT == null ? produktversion != null : !PRODUKTVERSION_EDEFAULT.equals(produktversion);
			case BaukastenPackage.NACHRICHT_TYPE__STANDARD:
				return isSetStandard();
			case BaukastenPackage.NACHRICHT_TYPE__TEST:
				return TEST_EDEFAULT == null ? test != null : !TEST_EDEFAULT.equals(test);
			case BaukastenPackage.NACHRICHT_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (produkt: ");
		result.append(produkt);
		result.append(", produkthersteller: ");
		result.append(produkthersteller);
		result.append(", produktversion: ");
		result.append(produktversion);
		result.append(", standard: ");
		if (standardESet) result.append(standard); else result.append("<unset>");
		result.append(", test: ");
		result.append(test);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //NachrichtTypeImpl
