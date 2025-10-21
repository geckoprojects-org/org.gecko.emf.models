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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moeglichkeiten Und Grenzen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.MoeglichkeitenUndGrenzenTypeImpl#isZutrauenKindJedenAlters <em>Zutrauen Kind Jeden Alters</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.MoeglichkeitenUndGrenzenTypeImpl#getZutrauenKindAltersangabe <em>Zutrauen Kind Altersangabe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.MoeglichkeitenUndGrenzenTypeImpl#isZutrauenKindBeeintraechtigung <em>Zutrauen Kind Beeintraechtigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.MoeglichkeitenUndGrenzenTypeImpl#isZutrauenKindKoerperlicheBeeintraechtigung <em>Zutrauen Kind Koerperliche Beeintraechtigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.MoeglichkeitenUndGrenzenTypeImpl#isZutrauenKindGeistigerBeeintraechtigung <em>Zutrauen Kind Geistiger Beeintraechtigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.MoeglichkeitenUndGrenzenTypeImpl#isZutrauenKindPsychischerBeeintraechtigung <em>Zutrauen Kind Psychischer Beeintraechtigung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoeglichkeitenUndGrenzenTypeImpl extends MinimalEObjectImpl.Container implements MoeglichkeitenUndGrenzenType {
	/**
	 * The default value of the '{@link #isZutrauenKindJedenAlters() <em>Zutrauen Kind Jeden Alters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZutrauenKindJedenAlters()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUTRAUEN_KIND_JEDEN_ALTERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZutrauenKindJedenAlters() <em>Zutrauen Kind Jeden Alters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZutrauenKindJedenAlters()
	 * @generated
	 * @ordered
	 */
	protected boolean zutrauenKindJedenAlters = ZUTRAUEN_KIND_JEDEN_ALTERS_EDEFAULT;

	/**
	 * This is true if the Zutrauen Kind Jeden Alters attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zutrauenKindJedenAltersESet;

	/**
	 * The default value of the '{@link #getZutrauenKindAltersangabe() <em>Zutrauen Kind Altersangabe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZutrauenKindAltersangabe()
	 * @generated
	 * @ordered
	 */
	protected static final String ZUTRAUEN_KIND_ALTERSANGABE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZutrauenKindAltersangabe() <em>Zutrauen Kind Altersangabe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZutrauenKindAltersangabe()
	 * @generated
	 * @ordered
	 */
	protected String zutrauenKindAltersangabe = ZUTRAUEN_KIND_ALTERSANGABE_EDEFAULT;

	/**
	 * The default value of the '{@link #isZutrauenKindBeeintraechtigung() <em>Zutrauen Kind Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZutrauenKindBeeintraechtigung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUTRAUEN_KIND_BEEINTRAECHTIGUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZutrauenKindBeeintraechtigung() <em>Zutrauen Kind Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZutrauenKindBeeintraechtigung()
	 * @generated
	 * @ordered
	 */
	protected boolean zutrauenKindBeeintraechtigung = ZUTRAUEN_KIND_BEEINTRAECHTIGUNG_EDEFAULT;

	/**
	 * This is true if the Zutrauen Kind Beeintraechtigung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zutrauenKindBeeintraechtigungESet;

	/**
	 * The default value of the '{@link #isZutrauenKindKoerperlicheBeeintraechtigung() <em>Zutrauen Kind Koerperliche Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZutrauenKindKoerperlicheBeeintraechtigung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUTRAUEN_KIND_KOERPERLICHE_BEEINTRAECHTIGUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZutrauenKindKoerperlicheBeeintraechtigung() <em>Zutrauen Kind Koerperliche Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZutrauenKindKoerperlicheBeeintraechtigung()
	 * @generated
	 * @ordered
	 */
	protected boolean zutrauenKindKoerperlicheBeeintraechtigung = ZUTRAUEN_KIND_KOERPERLICHE_BEEINTRAECHTIGUNG_EDEFAULT;

	/**
	 * This is true if the Zutrauen Kind Koerperliche Beeintraechtigung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zutrauenKindKoerperlicheBeeintraechtigungESet;

	/**
	 * The default value of the '{@link #isZutrauenKindGeistigerBeeintraechtigung() <em>Zutrauen Kind Geistiger Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZutrauenKindGeistigerBeeintraechtigung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUTRAUEN_KIND_GEISTIGER_BEEINTRAECHTIGUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZutrauenKindGeistigerBeeintraechtigung() <em>Zutrauen Kind Geistiger Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZutrauenKindGeistigerBeeintraechtigung()
	 * @generated
	 * @ordered
	 */
	protected boolean zutrauenKindGeistigerBeeintraechtigung = ZUTRAUEN_KIND_GEISTIGER_BEEINTRAECHTIGUNG_EDEFAULT;

	/**
	 * This is true if the Zutrauen Kind Geistiger Beeintraechtigung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zutrauenKindGeistigerBeeintraechtigungESet;

	/**
	 * The default value of the '{@link #isZutrauenKindPsychischerBeeintraechtigung() <em>Zutrauen Kind Psychischer Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZutrauenKindPsychischerBeeintraechtigung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUTRAUEN_KIND_PSYCHISCHER_BEEINTRAECHTIGUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZutrauenKindPsychischerBeeintraechtigung() <em>Zutrauen Kind Psychischer Beeintraechtigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZutrauenKindPsychischerBeeintraechtigung()
	 * @generated
	 * @ordered
	 */
	protected boolean zutrauenKindPsychischerBeeintraechtigung = ZUTRAUEN_KIND_PSYCHISCHER_BEEINTRAECHTIGUNG_EDEFAULT;

	/**
	 * This is true if the Zutrauen Kind Psychischer Beeintraechtigung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zutrauenKindPsychischerBeeintraechtigungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoeglichkeitenUndGrenzenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.MOEGLICHKEITEN_UND_GRENZEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZutrauenKindJedenAlters() {
		return zutrauenKindJedenAlters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZutrauenKindJedenAlters(boolean newZutrauenKindJedenAlters) {
		boolean oldZutrauenKindJedenAlters = zutrauenKindJedenAlters;
		zutrauenKindJedenAlters = newZutrauenKindJedenAlters;
		boolean oldZutrauenKindJedenAltersESet = zutrauenKindJedenAltersESet;
		zutrauenKindJedenAltersESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_JEDEN_ALTERS, oldZutrauenKindJedenAlters, zutrauenKindJedenAlters, !oldZutrauenKindJedenAltersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZutrauenKindJedenAlters() {
		boolean oldZutrauenKindJedenAlters = zutrauenKindJedenAlters;
		boolean oldZutrauenKindJedenAltersESet = zutrauenKindJedenAltersESet;
		zutrauenKindJedenAlters = ZUTRAUEN_KIND_JEDEN_ALTERS_EDEFAULT;
		zutrauenKindJedenAltersESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_JEDEN_ALTERS, oldZutrauenKindJedenAlters, ZUTRAUEN_KIND_JEDEN_ALTERS_EDEFAULT, oldZutrauenKindJedenAltersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZutrauenKindJedenAlters() {
		return zutrauenKindJedenAltersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZutrauenKindAltersangabe() {
		return zutrauenKindAltersangabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZutrauenKindAltersangabe(String newZutrauenKindAltersangabe) {
		String oldZutrauenKindAltersangabe = zutrauenKindAltersangabe;
		zutrauenKindAltersangabe = newZutrauenKindAltersangabe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_ALTERSANGABE, oldZutrauenKindAltersangabe, zutrauenKindAltersangabe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZutrauenKindBeeintraechtigung() {
		return zutrauenKindBeeintraechtigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZutrauenKindBeeintraechtigung(boolean newZutrauenKindBeeintraechtigung) {
		boolean oldZutrauenKindBeeintraechtigung = zutrauenKindBeeintraechtigung;
		zutrauenKindBeeintraechtigung = newZutrauenKindBeeintraechtigung;
		boolean oldZutrauenKindBeeintraechtigungESet = zutrauenKindBeeintraechtigungESet;
		zutrauenKindBeeintraechtigungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_BEEINTRAECHTIGUNG, oldZutrauenKindBeeintraechtigung, zutrauenKindBeeintraechtigung, !oldZutrauenKindBeeintraechtigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZutrauenKindBeeintraechtigung() {
		boolean oldZutrauenKindBeeintraechtigung = zutrauenKindBeeintraechtigung;
		boolean oldZutrauenKindBeeintraechtigungESet = zutrauenKindBeeintraechtigungESet;
		zutrauenKindBeeintraechtigung = ZUTRAUEN_KIND_BEEINTRAECHTIGUNG_EDEFAULT;
		zutrauenKindBeeintraechtigungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_BEEINTRAECHTIGUNG, oldZutrauenKindBeeintraechtigung, ZUTRAUEN_KIND_BEEINTRAECHTIGUNG_EDEFAULT, oldZutrauenKindBeeintraechtigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZutrauenKindBeeintraechtigung() {
		return zutrauenKindBeeintraechtigungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZutrauenKindKoerperlicheBeeintraechtigung() {
		return zutrauenKindKoerperlicheBeeintraechtigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZutrauenKindKoerperlicheBeeintraechtigung(boolean newZutrauenKindKoerperlicheBeeintraechtigung) {
		boolean oldZutrauenKindKoerperlicheBeeintraechtigung = zutrauenKindKoerperlicheBeeintraechtigung;
		zutrauenKindKoerperlicheBeeintraechtigung = newZutrauenKindKoerperlicheBeeintraechtigung;
		boolean oldZutrauenKindKoerperlicheBeeintraechtigungESet = zutrauenKindKoerperlicheBeeintraechtigungESet;
		zutrauenKindKoerperlicheBeeintraechtigungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_KOERPERLICHE_BEEINTRAECHTIGUNG, oldZutrauenKindKoerperlicheBeeintraechtigung, zutrauenKindKoerperlicheBeeintraechtigung, !oldZutrauenKindKoerperlicheBeeintraechtigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZutrauenKindKoerperlicheBeeintraechtigung() {
		boolean oldZutrauenKindKoerperlicheBeeintraechtigung = zutrauenKindKoerperlicheBeeintraechtigung;
		boolean oldZutrauenKindKoerperlicheBeeintraechtigungESet = zutrauenKindKoerperlicheBeeintraechtigungESet;
		zutrauenKindKoerperlicheBeeintraechtigung = ZUTRAUEN_KIND_KOERPERLICHE_BEEINTRAECHTIGUNG_EDEFAULT;
		zutrauenKindKoerperlicheBeeintraechtigungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_KOERPERLICHE_BEEINTRAECHTIGUNG, oldZutrauenKindKoerperlicheBeeintraechtigung, ZUTRAUEN_KIND_KOERPERLICHE_BEEINTRAECHTIGUNG_EDEFAULT, oldZutrauenKindKoerperlicheBeeintraechtigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZutrauenKindKoerperlicheBeeintraechtigung() {
		return zutrauenKindKoerperlicheBeeintraechtigungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZutrauenKindGeistigerBeeintraechtigung() {
		return zutrauenKindGeistigerBeeintraechtigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZutrauenKindGeistigerBeeintraechtigung(boolean newZutrauenKindGeistigerBeeintraechtigung) {
		boolean oldZutrauenKindGeistigerBeeintraechtigung = zutrauenKindGeistigerBeeintraechtigung;
		zutrauenKindGeistigerBeeintraechtigung = newZutrauenKindGeistigerBeeintraechtigung;
		boolean oldZutrauenKindGeistigerBeeintraechtigungESet = zutrauenKindGeistigerBeeintraechtigungESet;
		zutrauenKindGeistigerBeeintraechtigungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_GEISTIGER_BEEINTRAECHTIGUNG, oldZutrauenKindGeistigerBeeintraechtigung, zutrauenKindGeistigerBeeintraechtigung, !oldZutrauenKindGeistigerBeeintraechtigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZutrauenKindGeistigerBeeintraechtigung() {
		boolean oldZutrauenKindGeistigerBeeintraechtigung = zutrauenKindGeistigerBeeintraechtigung;
		boolean oldZutrauenKindGeistigerBeeintraechtigungESet = zutrauenKindGeistigerBeeintraechtigungESet;
		zutrauenKindGeistigerBeeintraechtigung = ZUTRAUEN_KIND_GEISTIGER_BEEINTRAECHTIGUNG_EDEFAULT;
		zutrauenKindGeistigerBeeintraechtigungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_GEISTIGER_BEEINTRAECHTIGUNG, oldZutrauenKindGeistigerBeeintraechtigung, ZUTRAUEN_KIND_GEISTIGER_BEEINTRAECHTIGUNG_EDEFAULT, oldZutrauenKindGeistigerBeeintraechtigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZutrauenKindGeistigerBeeintraechtigung() {
		return zutrauenKindGeistigerBeeintraechtigungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZutrauenKindPsychischerBeeintraechtigung() {
		return zutrauenKindPsychischerBeeintraechtigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZutrauenKindPsychischerBeeintraechtigung(boolean newZutrauenKindPsychischerBeeintraechtigung) {
		boolean oldZutrauenKindPsychischerBeeintraechtigung = zutrauenKindPsychischerBeeintraechtigung;
		zutrauenKindPsychischerBeeintraechtigung = newZutrauenKindPsychischerBeeintraechtigung;
		boolean oldZutrauenKindPsychischerBeeintraechtigungESet = zutrauenKindPsychischerBeeintraechtigungESet;
		zutrauenKindPsychischerBeeintraechtigungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_PSYCHISCHER_BEEINTRAECHTIGUNG, oldZutrauenKindPsychischerBeeintraechtigung, zutrauenKindPsychischerBeeintraechtigung, !oldZutrauenKindPsychischerBeeintraechtigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZutrauenKindPsychischerBeeintraechtigung() {
		boolean oldZutrauenKindPsychischerBeeintraechtigung = zutrauenKindPsychischerBeeintraechtigung;
		boolean oldZutrauenKindPsychischerBeeintraechtigungESet = zutrauenKindPsychischerBeeintraechtigungESet;
		zutrauenKindPsychischerBeeintraechtigung = ZUTRAUEN_KIND_PSYCHISCHER_BEEINTRAECHTIGUNG_EDEFAULT;
		zutrauenKindPsychischerBeeintraechtigungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_PSYCHISCHER_BEEINTRAECHTIGUNG, oldZutrauenKindPsychischerBeeintraechtigung, ZUTRAUEN_KIND_PSYCHISCHER_BEEINTRAECHTIGUNG_EDEFAULT, oldZutrauenKindPsychischerBeeintraechtigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZutrauenKindPsychischerBeeintraechtigung() {
		return zutrauenKindPsychischerBeeintraechtigungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_JEDEN_ALTERS:
				return isZutrauenKindJedenAlters();
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_ALTERSANGABE:
				return getZutrauenKindAltersangabe();
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_BEEINTRAECHTIGUNG:
				return isZutrauenKindBeeintraechtigung();
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_KOERPERLICHE_BEEINTRAECHTIGUNG:
				return isZutrauenKindKoerperlicheBeeintraechtigung();
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_GEISTIGER_BEEINTRAECHTIGUNG:
				return isZutrauenKindGeistigerBeeintraechtigung();
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_PSYCHISCHER_BEEINTRAECHTIGUNG:
				return isZutrauenKindPsychischerBeeintraechtigung();
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
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_JEDEN_ALTERS:
				setZutrauenKindJedenAlters((Boolean)newValue);
				return;
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_ALTERSANGABE:
				setZutrauenKindAltersangabe((String)newValue);
				return;
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_BEEINTRAECHTIGUNG:
				setZutrauenKindBeeintraechtigung((Boolean)newValue);
				return;
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_KOERPERLICHE_BEEINTRAECHTIGUNG:
				setZutrauenKindKoerperlicheBeeintraechtigung((Boolean)newValue);
				return;
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_GEISTIGER_BEEINTRAECHTIGUNG:
				setZutrauenKindGeistigerBeeintraechtigung((Boolean)newValue);
				return;
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_PSYCHISCHER_BEEINTRAECHTIGUNG:
				setZutrauenKindPsychischerBeeintraechtigung((Boolean)newValue);
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
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_JEDEN_ALTERS:
				unsetZutrauenKindJedenAlters();
				return;
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_ALTERSANGABE:
				setZutrauenKindAltersangabe(ZUTRAUEN_KIND_ALTERSANGABE_EDEFAULT);
				return;
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_BEEINTRAECHTIGUNG:
				unsetZutrauenKindBeeintraechtigung();
				return;
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_KOERPERLICHE_BEEINTRAECHTIGUNG:
				unsetZutrauenKindKoerperlicheBeeintraechtigung();
				return;
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_GEISTIGER_BEEINTRAECHTIGUNG:
				unsetZutrauenKindGeistigerBeeintraechtigung();
				return;
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_PSYCHISCHER_BEEINTRAECHTIGUNG:
				unsetZutrauenKindPsychischerBeeintraechtigung();
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
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_JEDEN_ALTERS:
				return isSetZutrauenKindJedenAlters();
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_ALTERSANGABE:
				return ZUTRAUEN_KIND_ALTERSANGABE_EDEFAULT == null ? zutrauenKindAltersangabe != null : !ZUTRAUEN_KIND_ALTERSANGABE_EDEFAULT.equals(zutrauenKindAltersangabe);
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_BEEINTRAECHTIGUNG:
				return isSetZutrauenKindBeeintraechtigung();
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_KOERPERLICHE_BEEINTRAECHTIGUNG:
				return isSetZutrauenKindKoerperlicheBeeintraechtigung();
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_GEISTIGER_BEEINTRAECHTIGUNG:
				return isSetZutrauenKindGeistigerBeeintraechtigung();
			case AdoptionPackage.MOEGLICHKEITEN_UND_GRENZEN_TYPE__ZUTRAUEN_KIND_PSYCHISCHER_BEEINTRAECHTIGUNG:
				return isSetZutrauenKindPsychischerBeeintraechtigung();
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
		result.append(" (zutrauenKindJedenAlters: ");
		if (zutrauenKindJedenAltersESet) result.append(zutrauenKindJedenAlters); else result.append("<unset>");
		result.append(", zutrauenKindAltersangabe: ");
		result.append(zutrauenKindAltersangabe);
		result.append(", zutrauenKindBeeintraechtigung: ");
		if (zutrauenKindBeeintraechtigungESet) result.append(zutrauenKindBeeintraechtigung); else result.append("<unset>");
		result.append(", zutrauenKindKoerperlicheBeeintraechtigung: ");
		if (zutrauenKindKoerperlicheBeeintraechtigungESet) result.append(zutrauenKindKoerperlicheBeeintraechtigung); else result.append("<unset>");
		result.append(", zutrauenKindGeistigerBeeintraechtigung: ");
		if (zutrauenKindGeistigerBeeintraechtigungESet) result.append(zutrauenKindGeistigerBeeintraechtigung); else result.append("<unset>");
		result.append(", zutrauenKindPsychischerBeeintraechtigung: ");
		if (zutrauenKindPsychischerBeeintraechtigungESet) result.append(zutrauenKindPsychischerBeeintraechtigung); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MoeglichkeitenUndGrenzenTypeImpl
