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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

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
 * An implementation of the model object '<em><b>Auslandsaufenthalt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslandsaufenthaltTypeImpl#getGrundDesAufenthalts <em>Grund Des Aufenthalts</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslandsaufenthaltTypeImpl#getAufenthaltsland <em>Aufenthaltsland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslandsaufenthaltTypeImpl#getNachweisAuslandsaufenthalt <em>Nachweis Auslandsaufenthalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslandsaufenthaltTypeImpl#isInlaendischesArbeitsverhaeltnis <em>Inlaendisches Arbeitsverhaeltnis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslandsaufenthaltTypeImpl#getPlzArbeitgeber <em>Plz Arbeitgeber</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslandsaufenthaltTypeImpl#getOrtArbeitgeber <em>Ort Arbeitgeber</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslandsaufenthaltTypeImpl#getBeginnAufenthalt <em>Beginn Aufenthalt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuslandsaufenthaltTypeImpl extends MinimalEObjectImpl.Container implements AuslandsaufenthaltType {
	/**
	 * The default value of the '{@link #getGrundDesAufenthalts() <em>Grund Des Aufenthalts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrundDesAufenthalts()
	 * @generated
	 * @ordered
	 */
	protected static final String GRUND_DES_AUFENTHALTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrundDesAufenthalts() <em>Grund Des Aufenthalts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrundDesAufenthalts()
	 * @generated
	 * @ordered
	 */
	protected String grundDesAufenthalts = GRUND_DES_AUFENTHALTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAufenthaltsland() <em>Aufenthaltsland</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufenthaltsland()
	 * @generated
	 * @ordered
	 */
	protected CodeStaatType aufenthaltsland;

	/**
	 * The cached value of the '{@link #getNachweisAuslandsaufenthalt() <em>Nachweis Auslandsaufenthalt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisAuslandsaufenthalt()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisAuslandsaufenthalt;

	/**
	 * The default value of the '{@link #isInlaendischesArbeitsverhaeltnis() <em>Inlaendisches Arbeitsverhaeltnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInlaendischesArbeitsverhaeltnis()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INLAENDISCHES_ARBEITSVERHAELTNIS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInlaendischesArbeitsverhaeltnis() <em>Inlaendisches Arbeitsverhaeltnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInlaendischesArbeitsverhaeltnis()
	 * @generated
	 * @ordered
	 */
	protected boolean inlaendischesArbeitsverhaeltnis = INLAENDISCHES_ARBEITSVERHAELTNIS_EDEFAULT;

	/**
	 * This is true if the Inlaendisches Arbeitsverhaeltnis attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inlaendischesArbeitsverhaeltnisESet;

	/**
	 * The default value of the '{@link #getPlzArbeitgeber() <em>Plz Arbeitgeber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlzArbeitgeber()
	 * @generated
	 * @ordered
	 */
	protected static final String PLZ_ARBEITGEBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlzArbeitgeber() <em>Plz Arbeitgeber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlzArbeitgeber()
	 * @generated
	 * @ordered
	 */
	protected String plzArbeitgeber = PLZ_ARBEITGEBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrtArbeitgeber() <em>Ort Arbeitgeber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrtArbeitgeber()
	 * @generated
	 * @ordered
	 */
	protected static final String ORT_ARBEITGEBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrtArbeitgeber() <em>Ort Arbeitgeber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrtArbeitgeber()
	 * @generated
	 * @ordered
	 */
	protected String ortArbeitgeber = ORT_ARBEITGEBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeginnAufenthalt() <em>Beginn Aufenthalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginnAufenthalt()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BEGINN_AUFENTHALT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginnAufenthalt() <em>Beginn Aufenthalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginnAufenthalt()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar beginnAufenthalt = BEGINN_AUFENTHALT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuslandsaufenthaltTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getAuslandsaufenthaltType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGrundDesAufenthalts() {
		return grundDesAufenthalts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrundDesAufenthalts(String newGrundDesAufenthalts) {
		String oldGrundDesAufenthalts = grundDesAufenthalts;
		grundDesAufenthalts = newGrundDesAufenthalts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__GRUND_DES_AUFENTHALTS, oldGrundDesAufenthalts, grundDesAufenthalts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeStaatType getAufenthaltsland() {
		return aufenthaltsland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAufenthaltsland(CodeStaatType newAufenthaltsland, NotificationChain msgs) {
		CodeStaatType oldAufenthaltsland = aufenthaltsland;
		aufenthaltsland = newAufenthaltsland;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__AUFENTHALTSLAND, oldAufenthaltsland, newAufenthaltsland);
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
	public void setAufenthaltsland(CodeStaatType newAufenthaltsland) {
		if (newAufenthaltsland != aufenthaltsland) {
			NotificationChain msgs = null;
			if (aufenthaltsland != null)
				msgs = ((InternalEObject)aufenthaltsland).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__AUFENTHALTSLAND, null, msgs);
			if (newAufenthaltsland != null)
				msgs = ((InternalEObject)newAufenthaltsland).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__AUFENTHALTSLAND, null, msgs);
			msgs = basicSetAufenthaltsland(newAufenthaltsland, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__AUFENTHALTSLAND, newAufenthaltsland, newAufenthaltsland));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisAuslandsaufenthalt() {
		if (nachweisAuslandsaufenthalt == null) {
			nachweisAuslandsaufenthalt = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__NACHWEIS_AUSLANDSAUFENTHALT);
		}
		return nachweisAuslandsaufenthalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInlaendischesArbeitsverhaeltnis() {
		return inlaendischesArbeitsverhaeltnis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInlaendischesArbeitsverhaeltnis(boolean newInlaendischesArbeitsverhaeltnis) {
		boolean oldInlaendischesArbeitsverhaeltnis = inlaendischesArbeitsverhaeltnis;
		inlaendischesArbeitsverhaeltnis = newInlaendischesArbeitsverhaeltnis;
		boolean oldInlaendischesArbeitsverhaeltnisESet = inlaendischesArbeitsverhaeltnisESet;
		inlaendischesArbeitsverhaeltnisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__INLAENDISCHES_ARBEITSVERHAELTNIS, oldInlaendischesArbeitsverhaeltnis, inlaendischesArbeitsverhaeltnis, !oldInlaendischesArbeitsverhaeltnisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInlaendischesArbeitsverhaeltnis() {
		boolean oldInlaendischesArbeitsverhaeltnis = inlaendischesArbeitsverhaeltnis;
		boolean oldInlaendischesArbeitsverhaeltnisESet = inlaendischesArbeitsverhaeltnisESet;
		inlaendischesArbeitsverhaeltnis = INLAENDISCHES_ARBEITSVERHAELTNIS_EDEFAULT;
		inlaendischesArbeitsverhaeltnisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__INLAENDISCHES_ARBEITSVERHAELTNIS, oldInlaendischesArbeitsverhaeltnis, INLAENDISCHES_ARBEITSVERHAELTNIS_EDEFAULT, oldInlaendischesArbeitsverhaeltnisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInlaendischesArbeitsverhaeltnis() {
		return inlaendischesArbeitsverhaeltnisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlzArbeitgeber() {
		return plzArbeitgeber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlzArbeitgeber(String newPlzArbeitgeber) {
		String oldPlzArbeitgeber = plzArbeitgeber;
		plzArbeitgeber = newPlzArbeitgeber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__PLZ_ARBEITGEBER, oldPlzArbeitgeber, plzArbeitgeber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrtArbeitgeber() {
		return ortArbeitgeber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrtArbeitgeber(String newOrtArbeitgeber) {
		String oldOrtArbeitgeber = ortArbeitgeber;
		ortArbeitgeber = newOrtArbeitgeber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__ORT_ARBEITGEBER, oldOrtArbeitgeber, ortArbeitgeber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getBeginnAufenthalt() {
		return beginnAufenthalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeginnAufenthalt(XMLGregorianCalendar newBeginnAufenthalt) {
		XMLGregorianCalendar oldBeginnAufenthalt = beginnAufenthalt;
		beginnAufenthalt = newBeginnAufenthalt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__BEGINN_AUFENTHALT, oldBeginnAufenthalt, beginnAufenthalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__AUFENTHALTSLAND:
				return basicSetAufenthaltsland(null, msgs);
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__NACHWEIS_AUSLANDSAUFENTHALT:
				return ((InternalEList<?>)getNachweisAuslandsaufenthalt()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__GRUND_DES_AUFENTHALTS:
				return getGrundDesAufenthalts();
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__AUFENTHALTSLAND:
				return getAufenthaltsland();
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__NACHWEIS_AUSLANDSAUFENTHALT:
				return getNachweisAuslandsaufenthalt();
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__INLAENDISCHES_ARBEITSVERHAELTNIS:
				return isInlaendischesArbeitsverhaeltnis();
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__PLZ_ARBEITGEBER:
				return getPlzArbeitgeber();
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__ORT_ARBEITGEBER:
				return getOrtArbeitgeber();
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__BEGINN_AUFENTHALT:
				return getBeginnAufenthalt();
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
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__GRUND_DES_AUFENTHALTS:
				setGrundDesAufenthalts((String)newValue);
				return;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__AUFENTHALTSLAND:
				setAufenthaltsland((CodeStaatType)newValue);
				return;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__NACHWEIS_AUSLANDSAUFENTHALT:
				getNachweisAuslandsaufenthalt().clear();
				getNachweisAuslandsaufenthalt().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__INLAENDISCHES_ARBEITSVERHAELTNIS:
				setInlaendischesArbeitsverhaeltnis((Boolean)newValue);
				return;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__PLZ_ARBEITGEBER:
				setPlzArbeitgeber((String)newValue);
				return;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__ORT_ARBEITGEBER:
				setOrtArbeitgeber((String)newValue);
				return;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__BEGINN_AUFENTHALT:
				setBeginnAufenthalt((XMLGregorianCalendar)newValue);
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
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__GRUND_DES_AUFENTHALTS:
				setGrundDesAufenthalts(GRUND_DES_AUFENTHALTS_EDEFAULT);
				return;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__AUFENTHALTSLAND:
				setAufenthaltsland((CodeStaatType)null);
				return;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__NACHWEIS_AUSLANDSAUFENTHALT:
				getNachweisAuslandsaufenthalt().clear();
				return;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__INLAENDISCHES_ARBEITSVERHAELTNIS:
				unsetInlaendischesArbeitsverhaeltnis();
				return;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__PLZ_ARBEITGEBER:
				setPlzArbeitgeber(PLZ_ARBEITGEBER_EDEFAULT);
				return;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__ORT_ARBEITGEBER:
				setOrtArbeitgeber(ORT_ARBEITGEBER_EDEFAULT);
				return;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__BEGINN_AUFENTHALT:
				setBeginnAufenthalt(BEGINN_AUFENTHALT_EDEFAULT);
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
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__GRUND_DES_AUFENTHALTS:
				return GRUND_DES_AUFENTHALTS_EDEFAULT == null ? grundDesAufenthalts != null : !GRUND_DES_AUFENTHALTS_EDEFAULT.equals(grundDesAufenthalts);
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__AUFENTHALTSLAND:
				return aufenthaltsland != null;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__NACHWEIS_AUSLANDSAUFENTHALT:
				return nachweisAuslandsaufenthalt != null && !nachweisAuslandsaufenthalt.isEmpty();
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__INLAENDISCHES_ARBEITSVERHAELTNIS:
				return isSetInlaendischesArbeitsverhaeltnis();
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__PLZ_ARBEITGEBER:
				return PLZ_ARBEITGEBER_EDEFAULT == null ? plzArbeitgeber != null : !PLZ_ARBEITGEBER_EDEFAULT.equals(plzArbeitgeber);
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__ORT_ARBEITGEBER:
				return ORT_ARBEITGEBER_EDEFAULT == null ? ortArbeitgeber != null : !ORT_ARBEITGEBER_EDEFAULT.equals(ortArbeitgeber);
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE__BEGINN_AUFENTHALT:
				return BEGINN_AUFENTHALT_EDEFAULT == null ? beginnAufenthalt != null : !BEGINN_AUFENTHALT_EDEFAULT.equals(beginnAufenthalt);
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
		result.append(" (grundDesAufenthalts: ");
		result.append(grundDesAufenthalts);
		result.append(", inlaendischesArbeitsverhaeltnis: ");
		if (inlaendischesArbeitsverhaeltnisESet) result.append(inlaendischesArbeitsverhaeltnis); else result.append("<unset>");
		result.append(", plzArbeitgeber: ");
		result.append(plzArbeitgeber);
		result.append(", ortArbeitgeber: ");
		result.append(ortArbeitgeber);
		result.append(", beginnAufenthalt: ");
		result.append(beginnAufenthalt);
		result.append(')');
		return result.toString();
	}

} //AuslandsaufenthaltTypeImpl
