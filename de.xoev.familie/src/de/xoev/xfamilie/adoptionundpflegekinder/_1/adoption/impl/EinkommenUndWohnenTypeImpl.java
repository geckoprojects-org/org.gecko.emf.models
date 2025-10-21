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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Einkommen Und Wohnen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenUndWohnenTypeImpl#getEinkuenfteAusTaetigkeit <em>Einkuenfte Aus Taetigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenUndWohnenTypeImpl#getAndereEinkuenfte <em>Andere Einkuenfte</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenUndWohnenTypeImpl#getSchuldverpflichtungen <em>Schuldverpflichtungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenUndWohnenTypeImpl#getUnterhaltsverpflichtungen <em>Unterhaltsverpflichtungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenUndWohnenTypeImpl#getMonatlicheFixkostenUnterkunft <em>Monatliche Fixkosten Unterkunft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenUndWohnenTypeImpl#getWohnverhaeltnisseAnzahlZimmer <em>Wohnverhaeltnisse Anzahl Zimmer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenUndWohnenTypeImpl#getWohnverhaeltnisseWohnflaeche <em>Wohnverhaeltnisse Wohnflaeche</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EinkommenUndWohnenTypeImpl extends MinimalEObjectImpl.Container implements EinkommenUndWohnenType {
	/**
	 * The default value of the '{@link #getEinkuenfteAusTaetigkeit() <em>Einkuenfte Aus Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkuenfteAusTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final float EINKUENFTE_AUS_TAETIGKEIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEinkuenfteAusTaetigkeit() <em>Einkuenfte Aus Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkuenfteAusTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected float einkuenfteAusTaetigkeit = EINKUENFTE_AUS_TAETIGKEIT_EDEFAULT;

	/**
	 * This is true if the Einkuenfte Aus Taetigkeit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einkuenfteAusTaetigkeitESet;

	/**
	 * The default value of the '{@link #getAndereEinkuenfte() <em>Andere Einkuenfte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndereEinkuenfte()
	 * @generated
	 * @ordered
	 */
	protected static final float ANDERE_EINKUENFTE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAndereEinkuenfte() <em>Andere Einkuenfte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndereEinkuenfte()
	 * @generated
	 * @ordered
	 */
	protected float andereEinkuenfte = ANDERE_EINKUENFTE_EDEFAULT;

	/**
	 * This is true if the Andere Einkuenfte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean andereEinkuenfteESet;

	/**
	 * The default value of the '{@link #getSchuldverpflichtungen() <em>Schuldverpflichtungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchuldverpflichtungen()
	 * @generated
	 * @ordered
	 */
	protected static final float SCHULDVERPFLICHTUNGEN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSchuldverpflichtungen() <em>Schuldverpflichtungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchuldverpflichtungen()
	 * @generated
	 * @ordered
	 */
	protected float schuldverpflichtungen = SCHULDVERPFLICHTUNGEN_EDEFAULT;

	/**
	 * This is true if the Schuldverpflichtungen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schuldverpflichtungenESet;

	/**
	 * The default value of the '{@link #getUnterhaltsverpflichtungen() <em>Unterhaltsverpflichtungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterhaltsverpflichtungen()
	 * @generated
	 * @ordered
	 */
	protected static final float UNTERHALTSVERPFLICHTUNGEN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUnterhaltsverpflichtungen() <em>Unterhaltsverpflichtungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterhaltsverpflichtungen()
	 * @generated
	 * @ordered
	 */
	protected float unterhaltsverpflichtungen = UNTERHALTSVERPFLICHTUNGEN_EDEFAULT;

	/**
	 * This is true if the Unterhaltsverpflichtungen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unterhaltsverpflichtungenESet;

	/**
	 * The default value of the '{@link #getMonatlicheFixkostenUnterkunft() <em>Monatliche Fixkosten Unterkunft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonatlicheFixkostenUnterkunft()
	 * @generated
	 * @ordered
	 */
	protected static final float MONATLICHE_FIXKOSTEN_UNTERKUNFT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMonatlicheFixkostenUnterkunft() <em>Monatliche Fixkosten Unterkunft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonatlicheFixkostenUnterkunft()
	 * @generated
	 * @ordered
	 */
	protected float monatlicheFixkostenUnterkunft = MONATLICHE_FIXKOSTEN_UNTERKUNFT_EDEFAULT;

	/**
	 * This is true if the Monatliche Fixkosten Unterkunft attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monatlicheFixkostenUnterkunftESet;

	/**
	 * The default value of the '{@link #getWohnverhaeltnisseAnzahlZimmer() <em>Wohnverhaeltnisse Anzahl Zimmer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnverhaeltnisseAnzahlZimmer()
	 * @generated
	 * @ordered
	 */
	protected static final float WOHNVERHAELTNISSE_ANZAHL_ZIMMER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWohnverhaeltnisseAnzahlZimmer() <em>Wohnverhaeltnisse Anzahl Zimmer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnverhaeltnisseAnzahlZimmer()
	 * @generated
	 * @ordered
	 */
	protected float wohnverhaeltnisseAnzahlZimmer = WOHNVERHAELTNISSE_ANZAHL_ZIMMER_EDEFAULT;

	/**
	 * This is true if the Wohnverhaeltnisse Anzahl Zimmer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wohnverhaeltnisseAnzahlZimmerESet;

	/**
	 * The default value of the '{@link #getWohnverhaeltnisseWohnflaeche() <em>Wohnverhaeltnisse Wohnflaeche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnverhaeltnisseWohnflaeche()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WOHNVERHAELTNISSE_WOHNFLAECHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWohnverhaeltnisseWohnflaeche() <em>Wohnverhaeltnisse Wohnflaeche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnverhaeltnisseWohnflaeche()
	 * @generated
	 * @ordered
	 */
	protected BigInteger wohnverhaeltnisseWohnflaeche = WOHNVERHAELTNISSE_WOHNFLAECHE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EinkommenUndWohnenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.EINKOMMEN_UND_WOHNEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getEinkuenfteAusTaetigkeit() {
		return einkuenfteAusTaetigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinkuenfteAusTaetigkeit(float newEinkuenfteAusTaetigkeit) {
		float oldEinkuenfteAusTaetigkeit = einkuenfteAusTaetigkeit;
		einkuenfteAusTaetigkeit = newEinkuenfteAusTaetigkeit;
		boolean oldEinkuenfteAusTaetigkeitESet = einkuenfteAusTaetigkeitESet;
		einkuenfteAusTaetigkeitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__EINKUENFTE_AUS_TAETIGKEIT, oldEinkuenfteAusTaetigkeit, einkuenfteAusTaetigkeit, !oldEinkuenfteAusTaetigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinkuenfteAusTaetigkeit() {
		float oldEinkuenfteAusTaetigkeit = einkuenfteAusTaetigkeit;
		boolean oldEinkuenfteAusTaetigkeitESet = einkuenfteAusTaetigkeitESet;
		einkuenfteAusTaetigkeit = EINKUENFTE_AUS_TAETIGKEIT_EDEFAULT;
		einkuenfteAusTaetigkeitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__EINKUENFTE_AUS_TAETIGKEIT, oldEinkuenfteAusTaetigkeit, EINKUENFTE_AUS_TAETIGKEIT_EDEFAULT, oldEinkuenfteAusTaetigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinkuenfteAusTaetigkeit() {
		return einkuenfteAusTaetigkeitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAndereEinkuenfte() {
		return andereEinkuenfte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAndereEinkuenfte(float newAndereEinkuenfte) {
		float oldAndereEinkuenfte = andereEinkuenfte;
		andereEinkuenfte = newAndereEinkuenfte;
		boolean oldAndereEinkuenfteESet = andereEinkuenfteESet;
		andereEinkuenfteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__ANDERE_EINKUENFTE, oldAndereEinkuenfte, andereEinkuenfte, !oldAndereEinkuenfteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAndereEinkuenfte() {
		float oldAndereEinkuenfte = andereEinkuenfte;
		boolean oldAndereEinkuenfteESet = andereEinkuenfteESet;
		andereEinkuenfte = ANDERE_EINKUENFTE_EDEFAULT;
		andereEinkuenfteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__ANDERE_EINKUENFTE, oldAndereEinkuenfte, ANDERE_EINKUENFTE_EDEFAULT, oldAndereEinkuenfteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAndereEinkuenfte() {
		return andereEinkuenfteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getSchuldverpflichtungen() {
		return schuldverpflichtungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchuldverpflichtungen(float newSchuldverpflichtungen) {
		float oldSchuldverpflichtungen = schuldverpflichtungen;
		schuldverpflichtungen = newSchuldverpflichtungen;
		boolean oldSchuldverpflichtungenESet = schuldverpflichtungenESet;
		schuldverpflichtungenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__SCHULDVERPFLICHTUNGEN, oldSchuldverpflichtungen, schuldverpflichtungen, !oldSchuldverpflichtungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSchuldverpflichtungen() {
		float oldSchuldverpflichtungen = schuldverpflichtungen;
		boolean oldSchuldverpflichtungenESet = schuldverpflichtungenESet;
		schuldverpflichtungen = SCHULDVERPFLICHTUNGEN_EDEFAULT;
		schuldverpflichtungenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__SCHULDVERPFLICHTUNGEN, oldSchuldverpflichtungen, SCHULDVERPFLICHTUNGEN_EDEFAULT, oldSchuldverpflichtungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSchuldverpflichtungen() {
		return schuldverpflichtungenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getUnterhaltsverpflichtungen() {
		return unterhaltsverpflichtungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnterhaltsverpflichtungen(float newUnterhaltsverpflichtungen) {
		float oldUnterhaltsverpflichtungen = unterhaltsverpflichtungen;
		unterhaltsverpflichtungen = newUnterhaltsverpflichtungen;
		boolean oldUnterhaltsverpflichtungenESet = unterhaltsverpflichtungenESet;
		unterhaltsverpflichtungenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__UNTERHALTSVERPFLICHTUNGEN, oldUnterhaltsverpflichtungen, unterhaltsverpflichtungen, !oldUnterhaltsverpflichtungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUnterhaltsverpflichtungen() {
		float oldUnterhaltsverpflichtungen = unterhaltsverpflichtungen;
		boolean oldUnterhaltsverpflichtungenESet = unterhaltsverpflichtungenESet;
		unterhaltsverpflichtungen = UNTERHALTSVERPFLICHTUNGEN_EDEFAULT;
		unterhaltsverpflichtungenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__UNTERHALTSVERPFLICHTUNGEN, oldUnterhaltsverpflichtungen, UNTERHALTSVERPFLICHTUNGEN_EDEFAULT, oldUnterhaltsverpflichtungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUnterhaltsverpflichtungen() {
		return unterhaltsverpflichtungenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMonatlicheFixkostenUnterkunft() {
		return monatlicheFixkostenUnterkunft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonatlicheFixkostenUnterkunft(float newMonatlicheFixkostenUnterkunft) {
		float oldMonatlicheFixkostenUnterkunft = monatlicheFixkostenUnterkunft;
		monatlicheFixkostenUnterkunft = newMonatlicheFixkostenUnterkunft;
		boolean oldMonatlicheFixkostenUnterkunftESet = monatlicheFixkostenUnterkunftESet;
		monatlicheFixkostenUnterkunftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT, oldMonatlicheFixkostenUnterkunft, monatlicheFixkostenUnterkunft, !oldMonatlicheFixkostenUnterkunftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMonatlicheFixkostenUnterkunft() {
		float oldMonatlicheFixkostenUnterkunft = monatlicheFixkostenUnterkunft;
		boolean oldMonatlicheFixkostenUnterkunftESet = monatlicheFixkostenUnterkunftESet;
		monatlicheFixkostenUnterkunft = MONATLICHE_FIXKOSTEN_UNTERKUNFT_EDEFAULT;
		monatlicheFixkostenUnterkunftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT, oldMonatlicheFixkostenUnterkunft, MONATLICHE_FIXKOSTEN_UNTERKUNFT_EDEFAULT, oldMonatlicheFixkostenUnterkunftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMonatlicheFixkostenUnterkunft() {
		return monatlicheFixkostenUnterkunftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWohnverhaeltnisseAnzahlZimmer() {
		return wohnverhaeltnisseAnzahlZimmer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWohnverhaeltnisseAnzahlZimmer(float newWohnverhaeltnisseAnzahlZimmer) {
		float oldWohnverhaeltnisseAnzahlZimmer = wohnverhaeltnisseAnzahlZimmer;
		wohnverhaeltnisseAnzahlZimmer = newWohnverhaeltnisseAnzahlZimmer;
		boolean oldWohnverhaeltnisseAnzahlZimmerESet = wohnverhaeltnisseAnzahlZimmerESet;
		wohnverhaeltnisseAnzahlZimmerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER, oldWohnverhaeltnisseAnzahlZimmer, wohnverhaeltnisseAnzahlZimmer, !oldWohnverhaeltnisseAnzahlZimmerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWohnverhaeltnisseAnzahlZimmer() {
		float oldWohnverhaeltnisseAnzahlZimmer = wohnverhaeltnisseAnzahlZimmer;
		boolean oldWohnverhaeltnisseAnzahlZimmerESet = wohnverhaeltnisseAnzahlZimmerESet;
		wohnverhaeltnisseAnzahlZimmer = WOHNVERHAELTNISSE_ANZAHL_ZIMMER_EDEFAULT;
		wohnverhaeltnisseAnzahlZimmerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER, oldWohnverhaeltnisseAnzahlZimmer, WOHNVERHAELTNISSE_ANZAHL_ZIMMER_EDEFAULT, oldWohnverhaeltnisseAnzahlZimmerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWohnverhaeltnisseAnzahlZimmer() {
		return wohnverhaeltnisseAnzahlZimmerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getWohnverhaeltnisseWohnflaeche() {
		return wohnverhaeltnisseWohnflaeche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWohnverhaeltnisseWohnflaeche(BigInteger newWohnverhaeltnisseWohnflaeche) {
		BigInteger oldWohnverhaeltnisseWohnflaeche = wohnverhaeltnisseWohnflaeche;
		wohnverhaeltnisseWohnflaeche = newWohnverhaeltnisseWohnflaeche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE, oldWohnverhaeltnisseWohnflaeche, wohnverhaeltnisseWohnflaeche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__EINKUENFTE_AUS_TAETIGKEIT:
				return getEinkuenfteAusTaetigkeit();
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__ANDERE_EINKUENFTE:
				return getAndereEinkuenfte();
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__SCHULDVERPFLICHTUNGEN:
				return getSchuldverpflichtungen();
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__UNTERHALTSVERPFLICHTUNGEN:
				return getUnterhaltsverpflichtungen();
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT:
				return getMonatlicheFixkostenUnterkunft();
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER:
				return getWohnverhaeltnisseAnzahlZimmer();
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE:
				return getWohnverhaeltnisseWohnflaeche();
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
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__EINKUENFTE_AUS_TAETIGKEIT:
				setEinkuenfteAusTaetigkeit((Float)newValue);
				return;
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__ANDERE_EINKUENFTE:
				setAndereEinkuenfte((Float)newValue);
				return;
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__SCHULDVERPFLICHTUNGEN:
				setSchuldverpflichtungen((Float)newValue);
				return;
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__UNTERHALTSVERPFLICHTUNGEN:
				setUnterhaltsverpflichtungen((Float)newValue);
				return;
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT:
				setMonatlicheFixkostenUnterkunft((Float)newValue);
				return;
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER:
				setWohnverhaeltnisseAnzahlZimmer((Float)newValue);
				return;
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE:
				setWohnverhaeltnisseWohnflaeche((BigInteger)newValue);
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
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__EINKUENFTE_AUS_TAETIGKEIT:
				unsetEinkuenfteAusTaetigkeit();
				return;
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__ANDERE_EINKUENFTE:
				unsetAndereEinkuenfte();
				return;
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__SCHULDVERPFLICHTUNGEN:
				unsetSchuldverpflichtungen();
				return;
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__UNTERHALTSVERPFLICHTUNGEN:
				unsetUnterhaltsverpflichtungen();
				return;
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT:
				unsetMonatlicheFixkostenUnterkunft();
				return;
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER:
				unsetWohnverhaeltnisseAnzahlZimmer();
				return;
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE:
				setWohnverhaeltnisseWohnflaeche(WOHNVERHAELTNISSE_WOHNFLAECHE_EDEFAULT);
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
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__EINKUENFTE_AUS_TAETIGKEIT:
				return isSetEinkuenfteAusTaetigkeit();
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__ANDERE_EINKUENFTE:
				return isSetAndereEinkuenfte();
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__SCHULDVERPFLICHTUNGEN:
				return isSetSchuldverpflichtungen();
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__UNTERHALTSVERPFLICHTUNGEN:
				return isSetUnterhaltsverpflichtungen();
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT:
				return isSetMonatlicheFixkostenUnterkunft();
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER:
				return isSetWohnverhaeltnisseAnzahlZimmer();
			case AdoptionPackage.EINKOMMEN_UND_WOHNEN_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE:
				return WOHNVERHAELTNISSE_WOHNFLAECHE_EDEFAULT == null ? wohnverhaeltnisseWohnflaeche != null : !WOHNVERHAELTNISSE_WOHNFLAECHE_EDEFAULT.equals(wohnverhaeltnisseWohnflaeche);
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
		result.append(" (einkuenfteAusTaetigkeit: ");
		if (einkuenfteAusTaetigkeitESet) result.append(einkuenfteAusTaetigkeit); else result.append("<unset>");
		result.append(", andereEinkuenfte: ");
		if (andereEinkuenfteESet) result.append(andereEinkuenfte); else result.append("<unset>");
		result.append(", schuldverpflichtungen: ");
		if (schuldverpflichtungenESet) result.append(schuldverpflichtungen); else result.append("<unset>");
		result.append(", unterhaltsverpflichtungen: ");
		if (unterhaltsverpflichtungenESet) result.append(unterhaltsverpflichtungen); else result.append("<unset>");
		result.append(", monatlicheFixkostenUnterkunft: ");
		if (monatlicheFixkostenUnterkunftESet) result.append(monatlicheFixkostenUnterkunft); else result.append("<unset>");
		result.append(", wohnverhaeltnisseAnzahlZimmer: ");
		if (wohnverhaeltnisseAnzahlZimmerESet) result.append(wohnverhaeltnisseAnzahlZimmer); else result.append("<unset>");
		result.append(", wohnverhaeltnisseWohnflaeche: ");
		result.append(wohnverhaeltnisseWohnflaeche);
		result.append(')');
		return result.toString();
	}

} //EinkommenUndWohnenTypeImpl
