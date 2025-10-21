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
package de.xoev.xfamilie.geburt._1.geburt.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeGemeindeVZRegionalschluesselType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;
import de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType;

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
 * An implementation of the model object '<em><b>Nachgeburtliche Angaben Zum Kind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.NachgeburtlicheAngabenZumKindTypeImpl#getNameDesKindes <em>Name Des Kindes</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.NachgeburtlicheAngabenZumKindTypeImpl#getGeburtsort <em>Geburtsort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.NachgeburtlicheAngabenZumKindTypeImpl#getGeburtsortStaat <em>Geburtsort Staat</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.NachgeburtlicheAngabenZumKindTypeImpl#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.NachgeburtlicheAngabenZumKindTypeImpl#getGeburtsregisterNummer <em>Geburtsregister Nummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.NachgeburtlicheAngabenZumKindTypeImpl#getGeburtsstandesamt <em>Geburtsstandesamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.NachgeburtlicheAngabenZumKindTypeImpl#getRegisterfuehrendeStelleARS <em>Registerfuehrende Stelle ARS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachgeburtlicheAngabenZumKindTypeImpl extends MinimalEObjectImpl.Container implements NachgeburtlicheAngabenZumKindType {
	/**
	 * The cached value of the '{@link #getNameDesKindes() <em>Name Des Kindes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDesKindes()
	 * @generated
	 * @ordered
	 */
	protected EList<NameNatuerlichePersonType> nameDesKindes;

	/**
	 * The default value of the '{@link #getGeburtsort() <em>Geburtsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsort()
	 * @generated
	 * @ordered
	 */
	protected static final String GEBURTSORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeburtsort() <em>Geburtsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsort()
	 * @generated
	 * @ordered
	 */
	protected String geburtsort = GEBURTSORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeburtsortStaat() <em>Geburtsort Staat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsortStaat()
	 * @generated
	 * @ordered
	 */
	protected CodeStaatType geburtsortStaat;

	/**
	 * The cached value of the '{@link #getGeburtsdatum() <em>Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType geburtsdatum;

	/**
	 * The default value of the '{@link #getGeburtsregisterNummer() <em>Geburtsregister Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsregisterNummer()
	 * @generated
	 * @ordered
	 */
	protected static final String GEBURTSREGISTER_NUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeburtsregisterNummer() <em>Geburtsregister Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsregisterNummer()
	 * @generated
	 * @ordered
	 */
	protected String geburtsregisterNummer = GEBURTSREGISTER_NUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeburtsstandesamt() <em>Geburtsstandesamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsstandesamt()
	 * @generated
	 * @ordered
	 */
	protected static final String GEBURTSSTANDESAMT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeburtsstandesamt() <em>Geburtsstandesamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsstandesamt()
	 * @generated
	 * @ordered
	 */
	protected String geburtsstandesamt = GEBURTSSTANDESAMT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegisterfuehrendeStelleARS() <em>Registerfuehrende Stelle ARS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterfuehrendeStelleARS()
	 * @generated
	 * @ordered
	 */
	protected CodeGemeindeVZRegionalschluesselType registerfuehrendeStelleARS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachgeburtlicheAngabenZumKindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeburtPackage.Literals.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NameNatuerlichePersonType> getNameDesKindes() {
		if (nameDesKindes == null) {
			nameDesKindes = new EObjectContainmentEList<NameNatuerlichePersonType>(NameNatuerlichePersonType.class, this, GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES);
		}
		return nameDesKindes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeburtsort() {
		return geburtsort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeburtsort(String newGeburtsort) {
		String oldGeburtsort = geburtsort;
		geburtsort = newGeburtsort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT, oldGeburtsort, geburtsort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeStaatType getGeburtsortStaat() {
		return geburtsortStaat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburtsortStaat(CodeStaatType newGeburtsortStaat, NotificationChain msgs) {
		CodeStaatType oldGeburtsortStaat = geburtsortStaat;
		geburtsortStaat = newGeburtsortStaat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT_STAAT, oldGeburtsortStaat, newGeburtsortStaat);
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
	public void setGeburtsortStaat(CodeStaatType newGeburtsortStaat) {
		if (newGeburtsortStaat != geburtsortStaat) {
			NotificationChain msgs = null;
			if (geburtsortStaat != null)
				msgs = ((InternalEObject)geburtsortStaat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT_STAAT, null, msgs);
			if (newGeburtsortStaat != null)
				msgs = ((InternalEObject)newGeburtsortStaat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT_STAAT, null, msgs);
			msgs = basicSetGeburtsortStaat(newGeburtsortStaat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT_STAAT, newGeburtsortStaat, newGeburtsortStaat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getGeburtsdatum() {
		return geburtsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburtsdatum(TeilbekanntesDatumType newGeburtsdatum, NotificationChain msgs) {
		TeilbekanntesDatumType oldGeburtsdatum = geburtsdatum;
		geburtsdatum = newGeburtsdatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSDATUM, oldGeburtsdatum, newGeburtsdatum);
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
	public void setGeburtsdatum(TeilbekanntesDatumType newGeburtsdatum) {
		if (newGeburtsdatum != geburtsdatum) {
			NotificationChain msgs = null;
			if (geburtsdatum != null)
				msgs = ((InternalEObject)geburtsdatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSDATUM, null, msgs);
			if (newGeburtsdatum != null)
				msgs = ((InternalEObject)newGeburtsdatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSDATUM, null, msgs);
			msgs = basicSetGeburtsdatum(newGeburtsdatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSDATUM, newGeburtsdatum, newGeburtsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeburtsregisterNummer() {
		return geburtsregisterNummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeburtsregisterNummer(String newGeburtsregisterNummer) {
		String oldGeburtsregisterNummer = geburtsregisterNummer;
		geburtsregisterNummer = newGeburtsregisterNummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSREGISTER_NUMMER, oldGeburtsregisterNummer, geburtsregisterNummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeburtsstandesamt() {
		return geburtsstandesamt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeburtsstandesamt(String newGeburtsstandesamt) {
		String oldGeburtsstandesamt = geburtsstandesamt;
		geburtsstandesamt = newGeburtsstandesamt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSSTANDESAMT, oldGeburtsstandesamt, geburtsstandesamt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeGemeindeVZRegionalschluesselType getRegisterfuehrendeStelleARS() {
		return registerfuehrendeStelleARS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterfuehrendeStelleARS(CodeGemeindeVZRegionalschluesselType newRegisterfuehrendeStelleARS, NotificationChain msgs) {
		CodeGemeindeVZRegionalschluesselType oldRegisterfuehrendeStelleARS = registerfuehrendeStelleARS;
		registerfuehrendeStelleARS = newRegisterfuehrendeStelleARS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__REGISTERFUEHRENDE_STELLE_ARS, oldRegisterfuehrendeStelleARS, newRegisterfuehrendeStelleARS);
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
	public void setRegisterfuehrendeStelleARS(CodeGemeindeVZRegionalschluesselType newRegisterfuehrendeStelleARS) {
		if (newRegisterfuehrendeStelleARS != registerfuehrendeStelleARS) {
			NotificationChain msgs = null;
			if (registerfuehrendeStelleARS != null)
				msgs = ((InternalEObject)registerfuehrendeStelleARS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__REGISTERFUEHRENDE_STELLE_ARS, null, msgs);
			if (newRegisterfuehrendeStelleARS != null)
				msgs = ((InternalEObject)newRegisterfuehrendeStelleARS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__REGISTERFUEHRENDE_STELLE_ARS, null, msgs);
			msgs = basicSetRegisterfuehrendeStelleARS(newRegisterfuehrendeStelleARS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__REGISTERFUEHRENDE_STELLE_ARS, newRegisterfuehrendeStelleARS, newRegisterfuehrendeStelleARS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES:
				return ((InternalEList<?>)getNameDesKindes()).basicRemove(otherEnd, msgs);
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT_STAAT:
				return basicSetGeburtsortStaat(null, msgs);
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSDATUM:
				return basicSetGeburtsdatum(null, msgs);
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__REGISTERFUEHRENDE_STELLE_ARS:
				return basicSetRegisterfuehrendeStelleARS(null, msgs);
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
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES:
				return getNameDesKindes();
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT:
				return getGeburtsort();
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT_STAAT:
				return getGeburtsortStaat();
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSDATUM:
				return getGeburtsdatum();
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSREGISTER_NUMMER:
				return getGeburtsregisterNummer();
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSSTANDESAMT:
				return getGeburtsstandesamt();
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__REGISTERFUEHRENDE_STELLE_ARS:
				return getRegisterfuehrendeStelleARS();
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
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES:
				getNameDesKindes().clear();
				getNameDesKindes().addAll((Collection<? extends NameNatuerlichePersonType>)newValue);
				return;
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT:
				setGeburtsort((String)newValue);
				return;
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT_STAAT:
				setGeburtsortStaat((CodeStaatType)newValue);
				return;
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSDATUM:
				setGeburtsdatum((TeilbekanntesDatumType)newValue);
				return;
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSREGISTER_NUMMER:
				setGeburtsregisterNummer((String)newValue);
				return;
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSSTANDESAMT:
				setGeburtsstandesamt((String)newValue);
				return;
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__REGISTERFUEHRENDE_STELLE_ARS:
				setRegisterfuehrendeStelleARS((CodeGemeindeVZRegionalschluesselType)newValue);
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
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES:
				getNameDesKindes().clear();
				return;
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT:
				setGeburtsort(GEBURTSORT_EDEFAULT);
				return;
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT_STAAT:
				setGeburtsortStaat((CodeStaatType)null);
				return;
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSDATUM:
				setGeburtsdatum((TeilbekanntesDatumType)null);
				return;
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSREGISTER_NUMMER:
				setGeburtsregisterNummer(GEBURTSREGISTER_NUMMER_EDEFAULT);
				return;
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSSTANDESAMT:
				setGeburtsstandesamt(GEBURTSSTANDESAMT_EDEFAULT);
				return;
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__REGISTERFUEHRENDE_STELLE_ARS:
				setRegisterfuehrendeStelleARS((CodeGemeindeVZRegionalschluesselType)null);
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
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES:
				return nameDesKindes != null && !nameDesKindes.isEmpty();
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT:
				return GEBURTSORT_EDEFAULT == null ? geburtsort != null : !GEBURTSORT_EDEFAULT.equals(geburtsort);
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT_STAAT:
				return geburtsortStaat != null;
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSDATUM:
				return geburtsdatum != null;
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSREGISTER_NUMMER:
				return GEBURTSREGISTER_NUMMER_EDEFAULT == null ? geburtsregisterNummer != null : !GEBURTSREGISTER_NUMMER_EDEFAULT.equals(geburtsregisterNummer);
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSSTANDESAMT:
				return GEBURTSSTANDESAMT_EDEFAULT == null ? geburtsstandesamt != null : !GEBURTSSTANDESAMT_EDEFAULT.equals(geburtsstandesamt);
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__REGISTERFUEHRENDE_STELLE_ARS:
				return registerfuehrendeStelleARS != null;
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
		result.append(" (geburtsort: ");
		result.append(geburtsort);
		result.append(", geburtsregisterNummer: ");
		result.append(geburtsregisterNummer);
		result.append(", geburtsstandesamt: ");
		result.append(geburtsstandesamt);
		result.append(')');
		return result.toString();
	}

} //NachgeburtlicheAngabenZumKindTypeImpl
