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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeVersicherungsartType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType;

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
 * An implementation of the model object '<em><b>Krankenversicherung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankenversicherungTypeImpl#getVersicherungsart <em>Versicherungsart</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankenversicherungTypeImpl#getBezeichnungKrankenkasse <em>Bezeichnung Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankenversicherungTypeImpl#getAnschriftKrankenkasse <em>Anschrift Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankenversicherungTypeImpl#getVersichertennummer <em>Versichertennummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankenversicherungTypeImpl#getAnschriftPostfachKrankenkasse <em>Anschrift Postfach Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankenversicherungTypeImpl#getNachweisKrankenversicherung <em>Nachweis Krankenversicherung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KrankenversicherungTypeImpl extends MinimalEObjectImpl.Container implements KrankenversicherungType {
	/**
	 * The cached value of the '{@link #getVersicherungsart() <em>Versicherungsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersicherungsart()
	 * @generated
	 * @ordered
	 */
	protected CodeVersicherungsartType versicherungsart;

	/**
	 * The default value of the '{@link #getBezeichnungKrankenkasse() <em>Bezeichnung Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected static final String BEZEICHNUNG_KRANKENKASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBezeichnungKrankenkasse() <em>Bezeichnung Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected String bezeichnungKrankenkasse = BEZEICHNUNG_KRANKENKASSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnschriftKrankenkasse() <em>Anschrift Krankenkasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschriftKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType anschriftKrankenkasse;

	/**
	 * The default value of the '{@link #getVersichertennummer() <em>Versichertennummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersichertennummer()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSICHERTENNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersichertennummer() <em>Versichertennummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersichertennummer()
	 * @generated
	 * @ordered
	 */
	protected String versichertennummer = VERSICHERTENNUMMER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnschriftPostfachKrankenkasse() <em>Anschrift Postfach Krankenkasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschriftPostfachKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftPostfachanschriftType anschriftPostfachKrankenkasse;

	/**
	 * The cached value of the '{@link #getNachweisKrankenversicherung() <em>Nachweis Krankenversicherung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisKrankenversicherung()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisKrankenversicherung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KrankenversicherungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getKrankenversicherungType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVersicherungsartType getVersicherungsart() {
		return versicherungsart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersicherungsart(CodeVersicherungsartType newVersicherungsart, NotificationChain msgs) {
		CodeVersicherungsartType oldVersicherungsart = versicherungsart;
		versicherungsart = newVersicherungsart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__VERSICHERUNGSART, oldVersicherungsart, newVersicherungsart);
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
	public void setVersicherungsart(CodeVersicherungsartType newVersicherungsart) {
		if (newVersicherungsart != versicherungsart) {
			NotificationChain msgs = null;
			if (versicherungsart != null)
				msgs = ((InternalEObject)versicherungsart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__VERSICHERUNGSART, null, msgs);
			if (newVersicherungsart != null)
				msgs = ((InternalEObject)newVersicherungsart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__VERSICHERUNGSART, null, msgs);
			msgs = basicSetVersicherungsart(newVersicherungsart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__VERSICHERUNGSART, newVersicherungsart, newVersicherungsart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBezeichnungKrankenkasse() {
		return bezeichnungKrankenkasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezeichnungKrankenkasse(String newBezeichnungKrankenkasse) {
		String oldBezeichnungKrankenkasse = bezeichnungKrankenkasse;
		bezeichnungKrankenkasse = newBezeichnungKrankenkasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__BEZEICHNUNG_KRANKENKASSE, oldBezeichnungKrankenkasse, bezeichnungKrankenkasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType getAnschriftKrankenkasse() {
		return anschriftKrankenkasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschriftKrankenkasse(PostalischeInlandsanschriftBasisType newAnschriftKrankenkasse, NotificationChain msgs) {
		PostalischeInlandsanschriftBasisType oldAnschriftKrankenkasse = anschriftKrankenkasse;
		anschriftKrankenkasse = newAnschriftKrankenkasse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_KRANKENKASSE, oldAnschriftKrankenkasse, newAnschriftKrankenkasse);
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
	public void setAnschriftKrankenkasse(PostalischeInlandsanschriftBasisType newAnschriftKrankenkasse) {
		if (newAnschriftKrankenkasse != anschriftKrankenkasse) {
			NotificationChain msgs = null;
			if (anschriftKrankenkasse != null)
				msgs = ((InternalEObject)anschriftKrankenkasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_KRANKENKASSE, null, msgs);
			if (newAnschriftKrankenkasse != null)
				msgs = ((InternalEObject)newAnschriftKrankenkasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_KRANKENKASSE, null, msgs);
			msgs = basicSetAnschriftKrankenkasse(newAnschriftKrankenkasse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_KRANKENKASSE, newAnschriftKrankenkasse, newAnschriftKrankenkasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersichertennummer() {
		return versichertennummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersichertennummer(String newVersichertennummer) {
		String oldVersichertennummer = versichertennummer;
		versichertennummer = newVersichertennummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__VERSICHERTENNUMMER, oldVersichertennummer, versichertennummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftPostfachanschriftType getAnschriftPostfachKrankenkasse() {
		return anschriftPostfachKrankenkasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschriftPostfachKrankenkasse(PostalischeInlandsanschriftPostfachanschriftType newAnschriftPostfachKrankenkasse, NotificationChain msgs) {
		PostalischeInlandsanschriftPostfachanschriftType oldAnschriftPostfachKrankenkasse = anschriftPostfachKrankenkasse;
		anschriftPostfachKrankenkasse = newAnschriftPostfachKrankenkasse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_POSTFACH_KRANKENKASSE, oldAnschriftPostfachKrankenkasse, newAnschriftPostfachKrankenkasse);
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
	public void setAnschriftPostfachKrankenkasse(PostalischeInlandsanschriftPostfachanschriftType newAnschriftPostfachKrankenkasse) {
		if (newAnschriftPostfachKrankenkasse != anschriftPostfachKrankenkasse) {
			NotificationChain msgs = null;
			if (anschriftPostfachKrankenkasse != null)
				msgs = ((InternalEObject)anschriftPostfachKrankenkasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_POSTFACH_KRANKENKASSE, null, msgs);
			if (newAnschriftPostfachKrankenkasse != null)
				msgs = ((InternalEObject)newAnschriftPostfachKrankenkasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_POSTFACH_KRANKENKASSE, null, msgs);
			msgs = basicSetAnschriftPostfachKrankenkasse(newAnschriftPostfachKrankenkasse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_POSTFACH_KRANKENKASSE, newAnschriftPostfachKrankenkasse, newAnschriftPostfachKrankenkasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisKrankenversicherung() {
		if (nachweisKrankenversicherung == null) {
			nachweisKrankenversicherung = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__NACHWEIS_KRANKENVERSICHERUNG);
		}
		return nachweisKrankenversicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__VERSICHERUNGSART:
				return basicSetVersicherungsart(null, msgs);
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_KRANKENKASSE:
				return basicSetAnschriftKrankenkasse(null, msgs);
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_POSTFACH_KRANKENKASSE:
				return basicSetAnschriftPostfachKrankenkasse(null, msgs);
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__NACHWEIS_KRANKENVERSICHERUNG:
				return ((InternalEList<?>)getNachweisKrankenversicherung()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__VERSICHERUNGSART:
				return getVersicherungsart();
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__BEZEICHNUNG_KRANKENKASSE:
				return getBezeichnungKrankenkasse();
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_KRANKENKASSE:
				return getAnschriftKrankenkasse();
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__VERSICHERTENNUMMER:
				return getVersichertennummer();
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_POSTFACH_KRANKENKASSE:
				return getAnschriftPostfachKrankenkasse();
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__NACHWEIS_KRANKENVERSICHERUNG:
				return getNachweisKrankenversicherung();
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
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__VERSICHERUNGSART:
				setVersicherungsart((CodeVersicherungsartType)newValue);
				return;
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__BEZEICHNUNG_KRANKENKASSE:
				setBezeichnungKrankenkasse((String)newValue);
				return;
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_KRANKENKASSE:
				setAnschriftKrankenkasse((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__VERSICHERTENNUMMER:
				setVersichertennummer((String)newValue);
				return;
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_POSTFACH_KRANKENKASSE:
				setAnschriftPostfachKrankenkasse((PostalischeInlandsanschriftPostfachanschriftType)newValue);
				return;
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__NACHWEIS_KRANKENVERSICHERUNG:
				getNachweisKrankenversicherung().clear();
				getNachweisKrankenversicherung().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__VERSICHERUNGSART:
				setVersicherungsart((CodeVersicherungsartType)null);
				return;
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__BEZEICHNUNG_KRANKENKASSE:
				setBezeichnungKrankenkasse(BEZEICHNUNG_KRANKENKASSE_EDEFAULT);
				return;
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_KRANKENKASSE:
				setAnschriftKrankenkasse((PostalischeInlandsanschriftBasisType)null);
				return;
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__VERSICHERTENNUMMER:
				setVersichertennummer(VERSICHERTENNUMMER_EDEFAULT);
				return;
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_POSTFACH_KRANKENKASSE:
				setAnschriftPostfachKrankenkasse((PostalischeInlandsanschriftPostfachanschriftType)null);
				return;
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__NACHWEIS_KRANKENVERSICHERUNG:
				getNachweisKrankenversicherung().clear();
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
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__VERSICHERUNGSART:
				return versicherungsart != null;
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__BEZEICHNUNG_KRANKENKASSE:
				return BEZEICHNUNG_KRANKENKASSE_EDEFAULT == null ? bezeichnungKrankenkasse != null : !BEZEICHNUNG_KRANKENKASSE_EDEFAULT.equals(bezeichnungKrankenkasse);
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_KRANKENKASSE:
				return anschriftKrankenkasse != null;
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__VERSICHERTENNUMMER:
				return VERSICHERTENNUMMER_EDEFAULT == null ? versichertennummer != null : !VERSICHERTENNUMMER_EDEFAULT.equals(versichertennummer);
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__ANSCHRIFT_POSTFACH_KRANKENKASSE:
				return anschriftPostfachKrankenkasse != null;
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE__NACHWEIS_KRANKENVERSICHERUNG:
				return nachweisKrankenversicherung != null && !nachweisKrankenversicherung.isEmpty();
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
		result.append(" (bezeichnungKrankenkasse: ");
		result.append(bezeichnungKrankenkasse);
		result.append(", versichertennummer: ");
		result.append(versichertennummer);
		result.append(')');
		return result.toString();
	}

} //KrankenversicherungTypeImpl
