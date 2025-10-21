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
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postalische Inlandsanschrift Basis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftBasisTypeImpl#getHausnummer <em>Hausnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftBasisTypeImpl#getHausnummerBuchstabeZusatzziffer <em>Hausnummer Buchstabe Zusatzziffer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftBasisTypeImpl#getPostleitzahl <em>Postleitzahl</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftBasisTypeImpl#getStockwerkswohnungsnummer <em>Stockwerkswohnungsnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftBasisTypeImpl#getStrasse <em>Strasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftBasisTypeImpl#getTeilnummerDerHausnummer <em>Teilnummer Der Hausnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftBasisTypeImpl#getWohnort <em>Wohnort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftBasisTypeImpl#getWohnortFruehererGemeindename <em>Wohnort Frueherer Gemeindename</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftBasisTypeImpl#getWohnungsinhaber <em>Wohnungsinhaber</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftBasisTypeImpl#getZusatzangaben <em>Zusatzangaben</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostalischeInlandsanschriftBasisTypeImpl extends MinimalEObjectImpl.Container implements PostalischeInlandsanschriftBasisType {
	/**
	 * The default value of the '{@link #getHausnummer() <em>Hausnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHausnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String HAUSNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHausnummer() <em>Hausnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHausnummer()
	 * @generated
	 * @ordered
	 */
	protected String hausnummer = HAUSNUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHausnummerBuchstabeZusatzziffer() <em>Hausnummer Buchstabe Zusatzziffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHausnummerBuchstabeZusatzziffer()
	 * @generated
	 * @ordered
	 */
	protected static final String HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHausnummerBuchstabeZusatzziffer() <em>Hausnummer Buchstabe Zusatzziffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHausnummerBuchstabeZusatzziffer()
	 * @generated
	 * @ordered
	 */
	protected String hausnummerBuchstabeZusatzziffer = HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostleitzahl() <em>Postleitzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostleitzahl()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTLEITZAHL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostleitzahl() <em>Postleitzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostleitzahl()
	 * @generated
	 * @ordered
	 */
	protected String postleitzahl = POSTLEITZAHL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStockwerkswohnungsnummer() <em>Stockwerkswohnungsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockwerkswohnungsnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String STOCKWERKSWOHNUNGSNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStockwerkswohnungsnummer() <em>Stockwerkswohnungsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockwerkswohnungsnummer()
	 * @generated
	 * @ordered
	 */
	protected String stockwerkswohnungsnummer = STOCKWERKSWOHNUNGSNUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrasse() <em>Strasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrasse()
	 * @generated
	 * @ordered
	 */
	protected static final String STRASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrasse() <em>Strasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrasse()
	 * @generated
	 * @ordered
	 */
	protected String strasse = STRASSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeilnummerDerHausnummer() <em>Teilnummer Der Hausnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeilnummerDerHausnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String TEILNUMMER_DER_HAUSNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTeilnummerDerHausnummer() <em>Teilnummer Der Hausnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeilnummerDerHausnummer()
	 * @generated
	 * @ordered
	 */
	protected String teilnummerDerHausnummer = TEILNUMMER_DER_HAUSNUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWohnort() <em>Wohnort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnort()
	 * @generated
	 * @ordered
	 */
	protected static final String WOHNORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWohnort() <em>Wohnort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnort()
	 * @generated
	 * @ordered
	 */
	protected String wohnort = WOHNORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWohnortFruehererGemeindename() <em>Wohnort Frueherer Gemeindename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnortFruehererGemeindename()
	 * @generated
	 * @ordered
	 */
	protected static final String WOHNORT_FRUEHERER_GEMEINDENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWohnortFruehererGemeindename() <em>Wohnort Frueherer Gemeindename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnortFruehererGemeindename()
	 * @generated
	 * @ordered
	 */
	protected String wohnortFruehererGemeindename = WOHNORT_FRUEHERER_GEMEINDENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWohnungsinhaber() <em>Wohnungsinhaber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnungsinhaber()
	 * @generated
	 * @ordered
	 */
	protected static final String WOHNUNGSINHABER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWohnungsinhaber() <em>Wohnungsinhaber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnungsinhaber()
	 * @generated
	 * @ordered
	 */
	protected String wohnungsinhaber = WOHNUNGSINHABER_EDEFAULT;

	/**
	 * The default value of the '{@link #getZusatzangaben() <em>Zusatzangaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatzangaben()
	 * @generated
	 * @ordered
	 */
	protected static final String ZUSATZANGABEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZusatzangaben() <em>Zusatzangaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatzangaben()
	 * @generated
	 * @ordered
	 */
	protected String zusatzangaben = ZUSATZANGABEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostalischeInlandsanschriftBasisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHausnummer() {
		return hausnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHausnummer(String newHausnummer) {
		String oldHausnummer = hausnummer;
		hausnummer = newHausnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER, oldHausnummer, hausnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHausnummerBuchstabeZusatzziffer() {
		return hausnummerBuchstabeZusatzziffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHausnummerBuchstabeZusatzziffer(String newHausnummerBuchstabeZusatzziffer) {
		String oldHausnummerBuchstabeZusatzziffer = hausnummerBuchstabeZusatzziffer;
		hausnummerBuchstabeZusatzziffer = newHausnummerBuchstabeZusatzziffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER, oldHausnummerBuchstabeZusatzziffer, hausnummerBuchstabeZusatzziffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostleitzahl() {
		return postleitzahl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostleitzahl(String newPostleitzahl) {
		String oldPostleitzahl = postleitzahl;
		postleitzahl = newPostleitzahl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__POSTLEITZAHL, oldPostleitzahl, postleitzahl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStockwerkswohnungsnummer() {
		return stockwerkswohnungsnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStockwerkswohnungsnummer(String newStockwerkswohnungsnummer) {
		String oldStockwerkswohnungsnummer = stockwerkswohnungsnummer;
		stockwerkswohnungsnummer = newStockwerkswohnungsnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STOCKWERKSWOHNUNGSNUMMER, oldStockwerkswohnungsnummer, stockwerkswohnungsnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStrasse() {
		return strasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrasse(String newStrasse) {
		String oldStrasse = strasse;
		strasse = newStrasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STRASSE, oldStrasse, strasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTeilnummerDerHausnummer() {
		return teilnummerDerHausnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeilnummerDerHausnummer(String newTeilnummerDerHausnummer) {
		String oldTeilnummerDerHausnummer = teilnummerDerHausnummer;
		teilnummerDerHausnummer = newTeilnummerDerHausnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__TEILNUMMER_DER_HAUSNUMMER, oldTeilnummerDerHausnummer, teilnummerDerHausnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWohnort() {
		return wohnort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWohnort(String newWohnort) {
		String oldWohnort = wohnort;
		wohnort = newWohnort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT, oldWohnort, wohnort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWohnortFruehererGemeindename() {
		return wohnortFruehererGemeindename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWohnortFruehererGemeindename(String newWohnortFruehererGemeindename) {
		String oldWohnortFruehererGemeindename = wohnortFruehererGemeindename;
		wohnortFruehererGemeindename = newWohnortFruehererGemeindename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME, oldWohnortFruehererGemeindename, wohnortFruehererGemeindename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWohnungsinhaber() {
		return wohnungsinhaber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWohnungsinhaber(String newWohnungsinhaber) {
		String oldWohnungsinhaber = wohnungsinhaber;
		wohnungsinhaber = newWohnungsinhaber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNUNGSINHABER, oldWohnungsinhaber, wohnungsinhaber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZusatzangaben() {
		return zusatzangaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZusatzangaben(String newZusatzangaben) {
		String oldZusatzangaben = zusatzangaben;
		zusatzangaben = newZusatzangaben;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__ZUSATZANGABEN, oldZusatzangaben, zusatzangaben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER:
				return getHausnummer();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER:
				return getHausnummerBuchstabeZusatzziffer();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__POSTLEITZAHL:
				return getPostleitzahl();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STOCKWERKSWOHNUNGSNUMMER:
				return getStockwerkswohnungsnummer();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STRASSE:
				return getStrasse();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__TEILNUMMER_DER_HAUSNUMMER:
				return getTeilnummerDerHausnummer();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT:
				return getWohnort();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME:
				return getWohnortFruehererGemeindename();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNUNGSINHABER:
				return getWohnungsinhaber();
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__ZUSATZANGABEN:
				return getZusatzangaben();
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
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER:
				setHausnummer((String)newValue);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER:
				setHausnummerBuchstabeZusatzziffer((String)newValue);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__POSTLEITZAHL:
				setPostleitzahl((String)newValue);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STOCKWERKSWOHNUNGSNUMMER:
				setStockwerkswohnungsnummer((String)newValue);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STRASSE:
				setStrasse((String)newValue);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__TEILNUMMER_DER_HAUSNUMMER:
				setTeilnummerDerHausnummer((String)newValue);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT:
				setWohnort((String)newValue);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME:
				setWohnortFruehererGemeindename((String)newValue);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNUNGSINHABER:
				setWohnungsinhaber((String)newValue);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__ZUSATZANGABEN:
				setZusatzangaben((String)newValue);
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
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER:
				setHausnummer(HAUSNUMMER_EDEFAULT);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER:
				setHausnummerBuchstabeZusatzziffer(HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER_EDEFAULT);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__POSTLEITZAHL:
				setPostleitzahl(POSTLEITZAHL_EDEFAULT);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STOCKWERKSWOHNUNGSNUMMER:
				setStockwerkswohnungsnummer(STOCKWERKSWOHNUNGSNUMMER_EDEFAULT);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STRASSE:
				setStrasse(STRASSE_EDEFAULT);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__TEILNUMMER_DER_HAUSNUMMER:
				setTeilnummerDerHausnummer(TEILNUMMER_DER_HAUSNUMMER_EDEFAULT);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT:
				setWohnort(WOHNORT_EDEFAULT);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME:
				setWohnortFruehererGemeindename(WOHNORT_FRUEHERER_GEMEINDENAME_EDEFAULT);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNUNGSINHABER:
				setWohnungsinhaber(WOHNUNGSINHABER_EDEFAULT);
				return;
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__ZUSATZANGABEN:
				setZusatzangaben(ZUSATZANGABEN_EDEFAULT);
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
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER:
				return HAUSNUMMER_EDEFAULT == null ? hausnummer != null : !HAUSNUMMER_EDEFAULT.equals(hausnummer);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER:
				return HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER_EDEFAULT == null ? hausnummerBuchstabeZusatzziffer != null : !HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER_EDEFAULT.equals(hausnummerBuchstabeZusatzziffer);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__POSTLEITZAHL:
				return POSTLEITZAHL_EDEFAULT == null ? postleitzahl != null : !POSTLEITZAHL_EDEFAULT.equals(postleitzahl);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STOCKWERKSWOHNUNGSNUMMER:
				return STOCKWERKSWOHNUNGSNUMMER_EDEFAULT == null ? stockwerkswohnungsnummer != null : !STOCKWERKSWOHNUNGSNUMMER_EDEFAULT.equals(stockwerkswohnungsnummer);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STRASSE:
				return STRASSE_EDEFAULT == null ? strasse != null : !STRASSE_EDEFAULT.equals(strasse);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__TEILNUMMER_DER_HAUSNUMMER:
				return TEILNUMMER_DER_HAUSNUMMER_EDEFAULT == null ? teilnummerDerHausnummer != null : !TEILNUMMER_DER_HAUSNUMMER_EDEFAULT.equals(teilnummerDerHausnummer);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT:
				return WOHNORT_EDEFAULT == null ? wohnort != null : !WOHNORT_EDEFAULT.equals(wohnort);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME:
				return WOHNORT_FRUEHERER_GEMEINDENAME_EDEFAULT == null ? wohnortFruehererGemeindename != null : !WOHNORT_FRUEHERER_GEMEINDENAME_EDEFAULT.equals(wohnortFruehererGemeindename);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNUNGSINHABER:
				return WOHNUNGSINHABER_EDEFAULT == null ? wohnungsinhaber != null : !WOHNUNGSINHABER_EDEFAULT.equals(wohnungsinhaber);
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__ZUSATZANGABEN:
				return ZUSATZANGABEN_EDEFAULT == null ? zusatzangaben != null : !ZUSATZANGABEN_EDEFAULT.equals(zusatzangaben);
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
		result.append(" (hausnummer: ");
		result.append(hausnummer);
		result.append(", hausnummerBuchstabeZusatzziffer: ");
		result.append(hausnummerBuchstabeZusatzziffer);
		result.append(", postleitzahl: ");
		result.append(postleitzahl);
		result.append(", stockwerkswohnungsnummer: ");
		result.append(stockwerkswohnungsnummer);
		result.append(", strasse: ");
		result.append(strasse);
		result.append(", teilnummerDerHausnummer: ");
		result.append(teilnummerDerHausnummer);
		result.append(", wohnort: ");
		result.append(wohnort);
		result.append(", wohnortFruehererGemeindename: ");
		result.append(wohnortFruehererGemeindename);
		result.append(", wohnungsinhaber: ");
		result.append(wohnungsinhaber);
		result.append(", zusatzangaben: ");
		result.append(zusatzangaben);
		result.append(')');
		return result.toString();
	}

} //PostalischeInlandsanschriftBasisTypeImpl
