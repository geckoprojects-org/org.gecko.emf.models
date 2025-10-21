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
package de.xoev.schemata.basisnachricht.g2g.basisg2g.impl;

import de.xoev.schemata.basisnachricht.g2g.basisg2g.BasisG2GPackage;
import de.xoev.schemata.basisnachricht.g2g.basisg2g.NachrichtG2GType;
import de.xoev.schemata.basisnachricht.g2g.basisg2g.NachrichtenkopfG2GType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nachricht G2G Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.NachrichtG2GTypeImpl#getNachrichtenkopfG2g <em>Nachrichtenkopf G2g</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.NachrichtG2GTypeImpl#getProdukt <em>Produkt</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.NachrichtG2GTypeImpl#getProdukthersteller <em>Produkthersteller</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.NachrichtG2GTypeImpl#getProduktversion <em>Produktversion</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.NachrichtG2GTypeImpl#getStandard <em>Standard</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.NachrichtG2GTypeImpl#getTest <em>Test</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.NachrichtG2GTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachrichtG2GTypeImpl extends MinimalEObjectImpl.Container implements NachrichtG2GType {
	/**
	 * The cached value of the '{@link #getNachrichtenkopfG2g() <em>Nachrichtenkopf G2g</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachrichtenkopfG2g()
	 * @generated
	 * @ordered
	 */
	protected NachrichtenkopfG2GType nachrichtenkopfG2g;

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
	protected static final String STANDARD_EDEFAULT = null;

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
	protected NachrichtG2GTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisG2GPackage.Literals.NACHRICHT_G2G_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachrichtenkopfG2GType getNachrichtenkopfG2g() {
		return nachrichtenkopfG2g;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachrichtenkopfG2g(NachrichtenkopfG2GType newNachrichtenkopfG2g, NotificationChain msgs) {
		NachrichtenkopfG2GType oldNachrichtenkopfG2g = nachrichtenkopfG2g;
		nachrichtenkopfG2g = newNachrichtenkopfG2g;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisG2GPackage.NACHRICHT_G2G_TYPE__NACHRICHTENKOPF_G2G, oldNachrichtenkopfG2g, newNachrichtenkopfG2g);
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
	public void setNachrichtenkopfG2g(NachrichtenkopfG2GType newNachrichtenkopfG2g) {
		if (newNachrichtenkopfG2g != nachrichtenkopfG2g) {
			NotificationChain msgs = null;
			if (nachrichtenkopfG2g != null)
				msgs = ((InternalEObject)nachrichtenkopfG2g).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisG2GPackage.NACHRICHT_G2G_TYPE__NACHRICHTENKOPF_G2G, null, msgs);
			if (newNachrichtenkopfG2g != null)
				msgs = ((InternalEObject)newNachrichtenkopfG2g).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisG2GPackage.NACHRICHT_G2G_TYPE__NACHRICHTENKOPF_G2G, null, msgs);
			msgs = basicSetNachrichtenkopfG2g(newNachrichtenkopfG2g, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisG2GPackage.NACHRICHT_G2G_TYPE__NACHRICHTENKOPF_G2G, newNachrichtenkopfG2g, newNachrichtenkopfG2g));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasisG2GPackage.NACHRICHT_G2G_TYPE__PRODUKT, oldProdukt, produkt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasisG2GPackage.NACHRICHT_G2G_TYPE__PRODUKTHERSTELLER, oldProdukthersteller, produkthersteller));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasisG2GPackage.NACHRICHT_G2G_TYPE__PRODUKTVERSION, oldProduktversion, produktversion));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisG2GPackage.NACHRICHT_G2G_TYPE__STANDARD, oldStandard, standard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasisG2GPackage.NACHRICHT_G2G_TYPE__TEST, oldTest, test));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasisG2GPackage.NACHRICHT_G2G_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__NACHRICHTENKOPF_G2G:
				return basicSetNachrichtenkopfG2g(null, msgs);
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
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__NACHRICHTENKOPF_G2G:
				return getNachrichtenkopfG2g();
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__PRODUKT:
				return getProdukt();
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__PRODUKTHERSTELLER:
				return getProdukthersteller();
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__PRODUKTVERSION:
				return getProduktversion();
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__STANDARD:
				return getStandard();
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__TEST:
				return getTest();
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__VERSION:
				return getVersion();
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
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__NACHRICHTENKOPF_G2G:
				setNachrichtenkopfG2g((NachrichtenkopfG2GType)newValue);
				return;
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__PRODUKT:
				setProdukt((String)newValue);
				return;
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__PRODUKTHERSTELLER:
				setProdukthersteller((String)newValue);
				return;
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__PRODUKTVERSION:
				setProduktversion((String)newValue);
				return;
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__STANDARD:
				setStandard((String)newValue);
				return;
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__TEST:
				setTest((String)newValue);
				return;
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__VERSION:
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
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__NACHRICHTENKOPF_G2G:
				setNachrichtenkopfG2g((NachrichtenkopfG2GType)null);
				return;
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__PRODUKT:
				setProdukt(PRODUKT_EDEFAULT);
				return;
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__PRODUKTHERSTELLER:
				setProdukthersteller(PRODUKTHERSTELLER_EDEFAULT);
				return;
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__PRODUKTVERSION:
				setProduktversion(PRODUKTVERSION_EDEFAULT);
				return;
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__STANDARD:
				setStandard(STANDARD_EDEFAULT);
				return;
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__TEST:
				setTest(TEST_EDEFAULT);
				return;
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__VERSION:
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
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__NACHRICHTENKOPF_G2G:
				return nachrichtenkopfG2g != null;
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__PRODUKT:
				return PRODUKT_EDEFAULT == null ? produkt != null : !PRODUKT_EDEFAULT.equals(produkt);
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__PRODUKTHERSTELLER:
				return PRODUKTHERSTELLER_EDEFAULT == null ? produkthersteller != null : !PRODUKTHERSTELLER_EDEFAULT.equals(produkthersteller);
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__PRODUKTVERSION:
				return PRODUKTVERSION_EDEFAULT == null ? produktversion != null : !PRODUKTVERSION_EDEFAULT.equals(produktversion);
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__STANDARD:
				return STANDARD_EDEFAULT == null ? standard != null : !STANDARD_EDEFAULT.equals(standard);
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__TEST:
				return TEST_EDEFAULT == null ? test != null : !TEST_EDEFAULT.equals(test);
			case BasisG2GPackage.NACHRICHT_G2G_TYPE__VERSION:
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
		result.append(standard);
		result.append(", test: ");
		result.append(test);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //NachrichtG2GTypeImpl
