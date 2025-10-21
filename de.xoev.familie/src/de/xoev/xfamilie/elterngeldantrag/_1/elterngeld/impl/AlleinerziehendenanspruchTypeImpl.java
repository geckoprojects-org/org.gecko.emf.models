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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

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
 * An implementation of the model object '<em><b>Alleinerziehendenanspruch Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AlleinerziehendenanspruchTypeImpl#isEntlastungsbetragAlleinerziehende <em>Entlastungsbetrag Alleinerziehende</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AlleinerziehendenanspruchTypeImpl#getNachweisEntlastungsbetrag <em>Nachweis Entlastungsbetrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AlleinerziehendenanspruchTypeImpl#isBetreuungDurchAnderenETUnmoeglich <em>Betreuung Durch Anderen ET Unmoeglich</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AlleinerziehendenanspruchTypeImpl#getNachweisBetreuung <em>Nachweis Betreuung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AlleinerziehendenanspruchTypeImpl#isKindeswohlgefaehrdungDurchAnderenET <em>Kindeswohlgefaehrdung Durch Anderen ET</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AlleinerziehendenanspruchTypeImpl#getNachweisKindeswohlgefaehrdung <em>Nachweis Kindeswohlgefaehrdung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlleinerziehendenanspruchTypeImpl extends MinimalEObjectImpl.Container implements AlleinerziehendenanspruchType {
	/**
	 * The default value of the '{@link #isEntlastungsbetragAlleinerziehende() <em>Entlastungsbetrag Alleinerziehende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntlastungsbetragAlleinerziehende()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENTLASTUNGSBETRAG_ALLEINERZIEHENDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEntlastungsbetragAlleinerziehende() <em>Entlastungsbetrag Alleinerziehende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntlastungsbetragAlleinerziehende()
	 * @generated
	 * @ordered
	 */
	protected boolean entlastungsbetragAlleinerziehende = ENTLASTUNGSBETRAG_ALLEINERZIEHENDE_EDEFAULT;

	/**
	 * This is true if the Entlastungsbetrag Alleinerziehende attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean entlastungsbetragAlleinerziehendeESet;

	/**
	 * The cached value of the '{@link #getNachweisEntlastungsbetrag() <em>Nachweis Entlastungsbetrag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisEntlastungsbetrag()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisEntlastungsbetrag;

	/**
	 * The default value of the '{@link #isBetreuungDurchAnderenETUnmoeglich() <em>Betreuung Durch Anderen ET Unmoeglich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBetreuungDurchAnderenETUnmoeglich()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BETREUUNG_DURCH_ANDEREN_ET_UNMOEGLICH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBetreuungDurchAnderenETUnmoeglich() <em>Betreuung Durch Anderen ET Unmoeglich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBetreuungDurchAnderenETUnmoeglich()
	 * @generated
	 * @ordered
	 */
	protected boolean betreuungDurchAnderenETUnmoeglich = BETREUUNG_DURCH_ANDEREN_ET_UNMOEGLICH_EDEFAULT;

	/**
	 * This is true if the Betreuung Durch Anderen ET Unmoeglich attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean betreuungDurchAnderenETUnmoeglichESet;

	/**
	 * The cached value of the '{@link #getNachweisBetreuung() <em>Nachweis Betreuung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisBetreuung()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisBetreuung;

	/**
	 * The default value of the '{@link #isKindeswohlgefaehrdungDurchAnderenET() <em>Kindeswohlgefaehrdung Durch Anderen ET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKindeswohlgefaehrdungDurchAnderenET()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KINDESWOHLGEFAEHRDUNG_DURCH_ANDEREN_ET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKindeswohlgefaehrdungDurchAnderenET() <em>Kindeswohlgefaehrdung Durch Anderen ET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKindeswohlgefaehrdungDurchAnderenET()
	 * @generated
	 * @ordered
	 */
	protected boolean kindeswohlgefaehrdungDurchAnderenET = KINDESWOHLGEFAEHRDUNG_DURCH_ANDEREN_ET_EDEFAULT;

	/**
	 * This is true if the Kindeswohlgefaehrdung Durch Anderen ET attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindeswohlgefaehrdungDurchAnderenETESet;

	/**
	 * The cached value of the '{@link #getNachweisKindeswohlgefaehrdung() <em>Nachweis Kindeswohlgefaehrdung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisKindeswohlgefaehrdung()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisKindeswohlgefaehrdung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlleinerziehendenanspruchTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getAlleinerziehendenanspruchType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEntlastungsbetragAlleinerziehende() {
		return entlastungsbetragAlleinerziehende;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntlastungsbetragAlleinerziehende(boolean newEntlastungsbetragAlleinerziehende) {
		boolean oldEntlastungsbetragAlleinerziehende = entlastungsbetragAlleinerziehende;
		entlastungsbetragAlleinerziehende = newEntlastungsbetragAlleinerziehende;
		boolean oldEntlastungsbetragAlleinerziehendeESet = entlastungsbetragAlleinerziehendeESet;
		entlastungsbetragAlleinerziehendeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__ENTLASTUNGSBETRAG_ALLEINERZIEHENDE, oldEntlastungsbetragAlleinerziehende, entlastungsbetragAlleinerziehende, !oldEntlastungsbetragAlleinerziehendeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEntlastungsbetragAlleinerziehende() {
		boolean oldEntlastungsbetragAlleinerziehende = entlastungsbetragAlleinerziehende;
		boolean oldEntlastungsbetragAlleinerziehendeESet = entlastungsbetragAlleinerziehendeESet;
		entlastungsbetragAlleinerziehende = ENTLASTUNGSBETRAG_ALLEINERZIEHENDE_EDEFAULT;
		entlastungsbetragAlleinerziehendeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__ENTLASTUNGSBETRAG_ALLEINERZIEHENDE, oldEntlastungsbetragAlleinerziehende, ENTLASTUNGSBETRAG_ALLEINERZIEHENDE_EDEFAULT, oldEntlastungsbetragAlleinerziehendeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEntlastungsbetragAlleinerziehende() {
		return entlastungsbetragAlleinerziehendeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisEntlastungsbetrag() {
		if (nachweisEntlastungsbetrag == null) {
			nachweisEntlastungsbetrag = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_ENTLASTUNGSBETRAG);
		}
		return nachweisEntlastungsbetrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBetreuungDurchAnderenETUnmoeglich() {
		return betreuungDurchAnderenETUnmoeglich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBetreuungDurchAnderenETUnmoeglich(boolean newBetreuungDurchAnderenETUnmoeglich) {
		boolean oldBetreuungDurchAnderenETUnmoeglich = betreuungDurchAnderenETUnmoeglich;
		betreuungDurchAnderenETUnmoeglich = newBetreuungDurchAnderenETUnmoeglich;
		boolean oldBetreuungDurchAnderenETUnmoeglichESet = betreuungDurchAnderenETUnmoeglichESet;
		betreuungDurchAnderenETUnmoeglichESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__BETREUUNG_DURCH_ANDEREN_ET_UNMOEGLICH, oldBetreuungDurchAnderenETUnmoeglich, betreuungDurchAnderenETUnmoeglich, !oldBetreuungDurchAnderenETUnmoeglichESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBetreuungDurchAnderenETUnmoeglich() {
		boolean oldBetreuungDurchAnderenETUnmoeglich = betreuungDurchAnderenETUnmoeglich;
		boolean oldBetreuungDurchAnderenETUnmoeglichESet = betreuungDurchAnderenETUnmoeglichESet;
		betreuungDurchAnderenETUnmoeglich = BETREUUNG_DURCH_ANDEREN_ET_UNMOEGLICH_EDEFAULT;
		betreuungDurchAnderenETUnmoeglichESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__BETREUUNG_DURCH_ANDEREN_ET_UNMOEGLICH, oldBetreuungDurchAnderenETUnmoeglich, BETREUUNG_DURCH_ANDEREN_ET_UNMOEGLICH_EDEFAULT, oldBetreuungDurchAnderenETUnmoeglichESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBetreuungDurchAnderenETUnmoeglich() {
		return betreuungDurchAnderenETUnmoeglichESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisBetreuung() {
		if (nachweisBetreuung == null) {
			nachweisBetreuung = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_BETREUUNG);
		}
		return nachweisBetreuung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKindeswohlgefaehrdungDurchAnderenET() {
		return kindeswohlgefaehrdungDurchAnderenET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKindeswohlgefaehrdungDurchAnderenET(boolean newKindeswohlgefaehrdungDurchAnderenET) {
		boolean oldKindeswohlgefaehrdungDurchAnderenET = kindeswohlgefaehrdungDurchAnderenET;
		kindeswohlgefaehrdungDurchAnderenET = newKindeswohlgefaehrdungDurchAnderenET;
		boolean oldKindeswohlgefaehrdungDurchAnderenETESet = kindeswohlgefaehrdungDurchAnderenETESet;
		kindeswohlgefaehrdungDurchAnderenETESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__KINDESWOHLGEFAEHRDUNG_DURCH_ANDEREN_ET, oldKindeswohlgefaehrdungDurchAnderenET, kindeswohlgefaehrdungDurchAnderenET, !oldKindeswohlgefaehrdungDurchAnderenETESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKindeswohlgefaehrdungDurchAnderenET() {
		boolean oldKindeswohlgefaehrdungDurchAnderenET = kindeswohlgefaehrdungDurchAnderenET;
		boolean oldKindeswohlgefaehrdungDurchAnderenETESet = kindeswohlgefaehrdungDurchAnderenETESet;
		kindeswohlgefaehrdungDurchAnderenET = KINDESWOHLGEFAEHRDUNG_DURCH_ANDEREN_ET_EDEFAULT;
		kindeswohlgefaehrdungDurchAnderenETESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__KINDESWOHLGEFAEHRDUNG_DURCH_ANDEREN_ET, oldKindeswohlgefaehrdungDurchAnderenET, KINDESWOHLGEFAEHRDUNG_DURCH_ANDEREN_ET_EDEFAULT, oldKindeswohlgefaehrdungDurchAnderenETESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKindeswohlgefaehrdungDurchAnderenET() {
		return kindeswohlgefaehrdungDurchAnderenETESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisKindeswohlgefaehrdung() {
		if (nachweisKindeswohlgefaehrdung == null) {
			nachweisKindeswohlgefaehrdung = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_KINDESWOHLGEFAEHRDUNG);
		}
		return nachweisKindeswohlgefaehrdung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_ENTLASTUNGSBETRAG:
				return ((InternalEList<?>)getNachweisEntlastungsbetrag()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_BETREUUNG:
				return ((InternalEList<?>)getNachweisBetreuung()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_KINDESWOHLGEFAEHRDUNG:
				return ((InternalEList<?>)getNachweisKindeswohlgefaehrdung()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__ENTLASTUNGSBETRAG_ALLEINERZIEHENDE:
				return isEntlastungsbetragAlleinerziehende();
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_ENTLASTUNGSBETRAG:
				return getNachweisEntlastungsbetrag();
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__BETREUUNG_DURCH_ANDEREN_ET_UNMOEGLICH:
				return isBetreuungDurchAnderenETUnmoeglich();
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_BETREUUNG:
				return getNachweisBetreuung();
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__KINDESWOHLGEFAEHRDUNG_DURCH_ANDEREN_ET:
				return isKindeswohlgefaehrdungDurchAnderenET();
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_KINDESWOHLGEFAEHRDUNG:
				return getNachweisKindeswohlgefaehrdung();
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
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__ENTLASTUNGSBETRAG_ALLEINERZIEHENDE:
				setEntlastungsbetragAlleinerziehende((Boolean)newValue);
				return;
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_ENTLASTUNGSBETRAG:
				getNachweisEntlastungsbetrag().clear();
				getNachweisEntlastungsbetrag().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__BETREUUNG_DURCH_ANDEREN_ET_UNMOEGLICH:
				setBetreuungDurchAnderenETUnmoeglich((Boolean)newValue);
				return;
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_BETREUUNG:
				getNachweisBetreuung().clear();
				getNachweisBetreuung().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__KINDESWOHLGEFAEHRDUNG_DURCH_ANDEREN_ET:
				setKindeswohlgefaehrdungDurchAnderenET((Boolean)newValue);
				return;
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_KINDESWOHLGEFAEHRDUNG:
				getNachweisKindeswohlgefaehrdung().clear();
				getNachweisKindeswohlgefaehrdung().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__ENTLASTUNGSBETRAG_ALLEINERZIEHENDE:
				unsetEntlastungsbetragAlleinerziehende();
				return;
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_ENTLASTUNGSBETRAG:
				getNachweisEntlastungsbetrag().clear();
				return;
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__BETREUUNG_DURCH_ANDEREN_ET_UNMOEGLICH:
				unsetBetreuungDurchAnderenETUnmoeglich();
				return;
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_BETREUUNG:
				getNachweisBetreuung().clear();
				return;
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__KINDESWOHLGEFAEHRDUNG_DURCH_ANDEREN_ET:
				unsetKindeswohlgefaehrdungDurchAnderenET();
				return;
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_KINDESWOHLGEFAEHRDUNG:
				getNachweisKindeswohlgefaehrdung().clear();
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
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__ENTLASTUNGSBETRAG_ALLEINERZIEHENDE:
				return isSetEntlastungsbetragAlleinerziehende();
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_ENTLASTUNGSBETRAG:
				return nachweisEntlastungsbetrag != null && !nachweisEntlastungsbetrag.isEmpty();
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__BETREUUNG_DURCH_ANDEREN_ET_UNMOEGLICH:
				return isSetBetreuungDurchAnderenETUnmoeglich();
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_BETREUUNG:
				return nachweisBetreuung != null && !nachweisBetreuung.isEmpty();
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__KINDESWOHLGEFAEHRDUNG_DURCH_ANDEREN_ET:
				return isSetKindeswohlgefaehrdungDurchAnderenET();
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE__NACHWEIS_KINDESWOHLGEFAEHRDUNG:
				return nachweisKindeswohlgefaehrdung != null && !nachweisKindeswohlgefaehrdung.isEmpty();
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
		result.append(" (entlastungsbetragAlleinerziehende: ");
		if (entlastungsbetragAlleinerziehendeESet) result.append(entlastungsbetragAlleinerziehende); else result.append("<unset>");
		result.append(", betreuungDurchAnderenETUnmoeglich: ");
		if (betreuungDurchAnderenETUnmoeglichESet) result.append(betreuungDurchAnderenETUnmoeglich); else result.append("<unset>");
		result.append(", kindeswohlgefaehrdungDurchAnderenET: ");
		if (kindeswohlgefaehrdungDurchAnderenETESet) result.append(kindeswohlgefaehrdungDurchAnderenET); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AlleinerziehendenanspruchTypeImpl
