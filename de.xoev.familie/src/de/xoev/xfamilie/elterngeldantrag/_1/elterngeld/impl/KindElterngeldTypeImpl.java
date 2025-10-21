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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeStandesamtnummernType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BehinderungKindType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType;

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
 * An implementation of the model object '<em><b>Kind Elterngeld Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindElterngeldTypeImpl#getNameKind <em>Name Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindElterngeldTypeImpl#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindElterngeldTypeImpl#getGeburtsurkunde <em>Geburtsurkunde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindElterngeldTypeImpl#getAnschriftBeiAntragstellung <em>Anschrift Bei Antragstellung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindElterngeldTypeImpl#getBesondersFruehGeborenesKind <em>Besonders Frueh Geborenes Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindElterngeldTypeImpl#getAdoption <em>Adoption</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindElterngeldTypeImpl#getMehrlingsgeburt <em>Mehrlingsgeburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindElterngeldTypeImpl#getBehinderungKind <em>Behinderung Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindElterngeldTypeImpl#getNummerGeburtsstandesamt <em>Nummer Geburtsstandesamt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KindElterngeldTypeImpl extends MinimalEObjectImpl.Container implements KindElterngeldType {
	/**
	 * The cached value of the '{@link #getNameKind() <em>Name Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameKind()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonType nameKind;

	/**
	 * The cached value of the '{@link #getGeburtsdatum() <em>Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected GeburtGeburtsortOptionalType geburtsdatum;

	/**
	 * The cached value of the '{@link #getGeburtsurkunde() <em>Geburtsurkunde</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsurkunde()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> geburtsurkunde;

	/**
	 * The cached value of the '{@link #getAnschriftBeiAntragstellung() <em>Anschrift Bei Antragstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschriftBeiAntragstellung()
	 * @generated
	 * @ordered
	 */
	protected AnschriftKindOptionalType anschriftBeiAntragstellung;

	/**
	 * The cached value of the '{@link #getBesondersFruehGeborenesKind() <em>Besonders Frueh Geborenes Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBesondersFruehGeborenesKind()
	 * @generated
	 * @ordered
	 */
	protected BesondersFruehGeborenesKindType besondersFruehGeborenesKind;

	/**
	 * The cached value of the '{@link #getAdoption() <em>Adoption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdoption()
	 * @generated
	 * @ordered
	 */
	protected AdoptionType adoption;

	/**
	 * The cached value of the '{@link #getMehrlingsgeburt() <em>Mehrlingsgeburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMehrlingsgeburt()
	 * @generated
	 * @ordered
	 */
	protected MehrlingsgeburtType mehrlingsgeburt;

	/**
	 * The cached value of the '{@link #getBehinderungKind() <em>Behinderung Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehinderungKind()
	 * @generated
	 * @ordered
	 */
	protected BehinderungKindType behinderungKind;

	/**
	 * The cached value of the '{@link #getNummerGeburtsstandesamt() <em>Nummer Geburtsstandesamt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNummerGeburtsstandesamt()
	 * @generated
	 * @ordered
	 */
	protected CodeStandesamtnummernType nummerGeburtsstandesamt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KindElterngeldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getKindElterngeldType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType getNameKind() {
		return nameKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameKind(NameNatuerlichePersonType newNameKind, NotificationChain msgs) {
		NameNatuerlichePersonType oldNameKind = nameKind;
		nameKind = newNameKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__NAME_KIND, oldNameKind, newNameKind);
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
	public void setNameKind(NameNatuerlichePersonType newNameKind) {
		if (newNameKind != nameKind) {
			NotificationChain msgs = null;
			if (nameKind != null)
				msgs = ((InternalEObject)nameKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__NAME_KIND, null, msgs);
			if (newNameKind != null)
				msgs = ((InternalEObject)newNameKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__NAME_KIND, null, msgs);
			msgs = basicSetNameKind(newNameKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__NAME_KIND, newNameKind, newNameKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtGeburtsortOptionalType getGeburtsdatum() {
		return geburtsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburtsdatum(GeburtGeburtsortOptionalType newGeburtsdatum, NotificationChain msgs) {
		GeburtGeburtsortOptionalType oldGeburtsdatum = geburtsdatum;
		geburtsdatum = newGeburtsdatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__GEBURTSDATUM, oldGeburtsdatum, newGeburtsdatum);
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
	public void setGeburtsdatum(GeburtGeburtsortOptionalType newGeburtsdatum) {
		if (newGeburtsdatum != geburtsdatum) {
			NotificationChain msgs = null;
			if (geburtsdatum != null)
				msgs = ((InternalEObject)geburtsdatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__GEBURTSDATUM, null, msgs);
			if (newGeburtsdatum != null)
				msgs = ((InternalEObject)newGeburtsdatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__GEBURTSDATUM, null, msgs);
			msgs = basicSetGeburtsdatum(newGeburtsdatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__GEBURTSDATUM, newGeburtsdatum, newGeburtsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getGeburtsurkunde() {
		if (geburtsurkunde == null) {
			geburtsurkunde = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.KIND_ELTERNGELD_TYPE__GEBURTSURKUNDE);
		}
		return geburtsurkunde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnschriftKindOptionalType getAnschriftBeiAntragstellung() {
		return anschriftBeiAntragstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschriftBeiAntragstellung(AnschriftKindOptionalType newAnschriftBeiAntragstellung, NotificationChain msgs) {
		AnschriftKindOptionalType oldAnschriftBeiAntragstellung = anschriftBeiAntragstellung;
		anschriftBeiAntragstellung = newAnschriftBeiAntragstellung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__ANSCHRIFT_BEI_ANTRAGSTELLUNG, oldAnschriftBeiAntragstellung, newAnschriftBeiAntragstellung);
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
	public void setAnschriftBeiAntragstellung(AnschriftKindOptionalType newAnschriftBeiAntragstellung) {
		if (newAnschriftBeiAntragstellung != anschriftBeiAntragstellung) {
			NotificationChain msgs = null;
			if (anschriftBeiAntragstellung != null)
				msgs = ((InternalEObject)anschriftBeiAntragstellung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__ANSCHRIFT_BEI_ANTRAGSTELLUNG, null, msgs);
			if (newAnschriftBeiAntragstellung != null)
				msgs = ((InternalEObject)newAnschriftBeiAntragstellung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__ANSCHRIFT_BEI_ANTRAGSTELLUNG, null, msgs);
			msgs = basicSetAnschriftBeiAntragstellung(newAnschriftBeiAntragstellung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__ANSCHRIFT_BEI_ANTRAGSTELLUNG, newAnschriftBeiAntragstellung, newAnschriftBeiAntragstellung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BesondersFruehGeborenesKindType getBesondersFruehGeborenesKind() {
		return besondersFruehGeborenesKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBesondersFruehGeborenesKind(BesondersFruehGeborenesKindType newBesondersFruehGeborenesKind, NotificationChain msgs) {
		BesondersFruehGeborenesKindType oldBesondersFruehGeborenesKind = besondersFruehGeborenesKind;
		besondersFruehGeborenesKind = newBesondersFruehGeborenesKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__BESONDERS_FRUEH_GEBORENES_KIND, oldBesondersFruehGeborenesKind, newBesondersFruehGeborenesKind);
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
	public void setBesondersFruehGeborenesKind(BesondersFruehGeborenesKindType newBesondersFruehGeborenesKind) {
		if (newBesondersFruehGeborenesKind != besondersFruehGeborenesKind) {
			NotificationChain msgs = null;
			if (besondersFruehGeborenesKind != null)
				msgs = ((InternalEObject)besondersFruehGeborenesKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__BESONDERS_FRUEH_GEBORENES_KIND, null, msgs);
			if (newBesondersFruehGeborenesKind != null)
				msgs = ((InternalEObject)newBesondersFruehGeborenesKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__BESONDERS_FRUEH_GEBORENES_KIND, null, msgs);
			msgs = basicSetBesondersFruehGeborenesKind(newBesondersFruehGeborenesKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__BESONDERS_FRUEH_GEBORENES_KIND, newBesondersFruehGeborenesKind, newBesondersFruehGeborenesKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdoptionType getAdoption() {
		return adoption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdoption(AdoptionType newAdoption, NotificationChain msgs) {
		AdoptionType oldAdoption = adoption;
		adoption = newAdoption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__ADOPTION, oldAdoption, newAdoption);
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
	public void setAdoption(AdoptionType newAdoption) {
		if (newAdoption != adoption) {
			NotificationChain msgs = null;
			if (adoption != null)
				msgs = ((InternalEObject)adoption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__ADOPTION, null, msgs);
			if (newAdoption != null)
				msgs = ((InternalEObject)newAdoption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__ADOPTION, null, msgs);
			msgs = basicSetAdoption(newAdoption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__ADOPTION, newAdoption, newAdoption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MehrlingsgeburtType getMehrlingsgeburt() {
		return mehrlingsgeburt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMehrlingsgeburt(MehrlingsgeburtType newMehrlingsgeburt, NotificationChain msgs) {
		MehrlingsgeburtType oldMehrlingsgeburt = mehrlingsgeburt;
		mehrlingsgeburt = newMehrlingsgeburt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__MEHRLINGSGEBURT, oldMehrlingsgeburt, newMehrlingsgeburt);
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
	public void setMehrlingsgeburt(MehrlingsgeburtType newMehrlingsgeburt) {
		if (newMehrlingsgeburt != mehrlingsgeburt) {
			NotificationChain msgs = null;
			if (mehrlingsgeburt != null)
				msgs = ((InternalEObject)mehrlingsgeburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__MEHRLINGSGEBURT, null, msgs);
			if (newMehrlingsgeburt != null)
				msgs = ((InternalEObject)newMehrlingsgeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__MEHRLINGSGEBURT, null, msgs);
			msgs = basicSetMehrlingsgeburt(newMehrlingsgeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__MEHRLINGSGEBURT, newMehrlingsgeburt, newMehrlingsgeburt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehinderungKindType getBehinderungKind() {
		return behinderungKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehinderungKind(BehinderungKindType newBehinderungKind, NotificationChain msgs) {
		BehinderungKindType oldBehinderungKind = behinderungKind;
		behinderungKind = newBehinderungKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__BEHINDERUNG_KIND, oldBehinderungKind, newBehinderungKind);
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
	public void setBehinderungKind(BehinderungKindType newBehinderungKind) {
		if (newBehinderungKind != behinderungKind) {
			NotificationChain msgs = null;
			if (behinderungKind != null)
				msgs = ((InternalEObject)behinderungKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__BEHINDERUNG_KIND, null, msgs);
			if (newBehinderungKind != null)
				msgs = ((InternalEObject)newBehinderungKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__BEHINDERUNG_KIND, null, msgs);
			msgs = basicSetBehinderungKind(newBehinderungKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__BEHINDERUNG_KIND, newBehinderungKind, newBehinderungKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeStandesamtnummernType getNummerGeburtsstandesamt() {
		return nummerGeburtsstandesamt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNummerGeburtsstandesamt(CodeStandesamtnummernType newNummerGeburtsstandesamt, NotificationChain msgs) {
		CodeStandesamtnummernType oldNummerGeburtsstandesamt = nummerGeburtsstandesamt;
		nummerGeburtsstandesamt = newNummerGeburtsstandesamt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__NUMMER_GEBURTSSTANDESAMT, oldNummerGeburtsstandesamt, newNummerGeburtsstandesamt);
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
	public void setNummerGeburtsstandesamt(CodeStandesamtnummernType newNummerGeburtsstandesamt) {
		if (newNummerGeburtsstandesamt != nummerGeburtsstandesamt) {
			NotificationChain msgs = null;
			if (nummerGeburtsstandesamt != null)
				msgs = ((InternalEObject)nummerGeburtsstandesamt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__NUMMER_GEBURTSSTANDESAMT, null, msgs);
			if (newNummerGeburtsstandesamt != null)
				msgs = ((InternalEObject)newNummerGeburtsstandesamt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_ELTERNGELD_TYPE__NUMMER_GEBURTSSTANDESAMT, null, msgs);
			msgs = basicSetNummerGeburtsstandesamt(newNummerGeburtsstandesamt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_ELTERNGELD_TYPE__NUMMER_GEBURTSSTANDESAMT, newNummerGeburtsstandesamt, newNummerGeburtsstandesamt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__NAME_KIND:
				return basicSetNameKind(null, msgs);
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__GEBURTSDATUM:
				return basicSetGeburtsdatum(null, msgs);
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__GEBURTSURKUNDE:
				return ((InternalEList<?>)getGeburtsurkunde()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__ANSCHRIFT_BEI_ANTRAGSTELLUNG:
				return basicSetAnschriftBeiAntragstellung(null, msgs);
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__BESONDERS_FRUEH_GEBORENES_KIND:
				return basicSetBesondersFruehGeborenesKind(null, msgs);
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__ADOPTION:
				return basicSetAdoption(null, msgs);
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__MEHRLINGSGEBURT:
				return basicSetMehrlingsgeburt(null, msgs);
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__BEHINDERUNG_KIND:
				return basicSetBehinderungKind(null, msgs);
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__NUMMER_GEBURTSSTANDESAMT:
				return basicSetNummerGeburtsstandesamt(null, msgs);
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
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__NAME_KIND:
				return getNameKind();
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__GEBURTSDATUM:
				return getGeburtsdatum();
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__GEBURTSURKUNDE:
				return getGeburtsurkunde();
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__ANSCHRIFT_BEI_ANTRAGSTELLUNG:
				return getAnschriftBeiAntragstellung();
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__BESONDERS_FRUEH_GEBORENES_KIND:
				return getBesondersFruehGeborenesKind();
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__ADOPTION:
				return getAdoption();
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__MEHRLINGSGEBURT:
				return getMehrlingsgeburt();
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__BEHINDERUNG_KIND:
				return getBehinderungKind();
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__NUMMER_GEBURTSSTANDESAMT:
				return getNummerGeburtsstandesamt();
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
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__NAME_KIND:
				setNameKind((NameNatuerlichePersonType)newValue);
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__GEBURTSDATUM:
				setGeburtsdatum((GeburtGeburtsortOptionalType)newValue);
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__GEBURTSURKUNDE:
				getGeburtsurkunde().clear();
				getGeburtsurkunde().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__ANSCHRIFT_BEI_ANTRAGSTELLUNG:
				setAnschriftBeiAntragstellung((AnschriftKindOptionalType)newValue);
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__BESONDERS_FRUEH_GEBORENES_KIND:
				setBesondersFruehGeborenesKind((BesondersFruehGeborenesKindType)newValue);
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__ADOPTION:
				setAdoption((AdoptionType)newValue);
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__MEHRLINGSGEBURT:
				setMehrlingsgeburt((MehrlingsgeburtType)newValue);
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__BEHINDERUNG_KIND:
				setBehinderungKind((BehinderungKindType)newValue);
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__NUMMER_GEBURTSSTANDESAMT:
				setNummerGeburtsstandesamt((CodeStandesamtnummernType)newValue);
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
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__NAME_KIND:
				setNameKind((NameNatuerlichePersonType)null);
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__GEBURTSDATUM:
				setGeburtsdatum((GeburtGeburtsortOptionalType)null);
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__GEBURTSURKUNDE:
				getGeburtsurkunde().clear();
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__ANSCHRIFT_BEI_ANTRAGSTELLUNG:
				setAnschriftBeiAntragstellung((AnschriftKindOptionalType)null);
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__BESONDERS_FRUEH_GEBORENES_KIND:
				setBesondersFruehGeborenesKind((BesondersFruehGeborenesKindType)null);
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__ADOPTION:
				setAdoption((AdoptionType)null);
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__MEHRLINGSGEBURT:
				setMehrlingsgeburt((MehrlingsgeburtType)null);
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__BEHINDERUNG_KIND:
				setBehinderungKind((BehinderungKindType)null);
				return;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__NUMMER_GEBURTSSTANDESAMT:
				setNummerGeburtsstandesamt((CodeStandesamtnummernType)null);
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
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__NAME_KIND:
				return nameKind != null;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__GEBURTSDATUM:
				return geburtsdatum != null;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__GEBURTSURKUNDE:
				return geburtsurkunde != null && !geburtsurkunde.isEmpty();
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__ANSCHRIFT_BEI_ANTRAGSTELLUNG:
				return anschriftBeiAntragstellung != null;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__BESONDERS_FRUEH_GEBORENES_KIND:
				return besondersFruehGeborenesKind != null;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__ADOPTION:
				return adoption != null;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__MEHRLINGSGEBURT:
				return mehrlingsgeburt != null;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__BEHINDERUNG_KIND:
				return behinderungKind != null;
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE__NUMMER_GEBURTSSTANDESAMT:
				return nummerGeburtsstandesamt != null;
		}
		return super.eIsSet(featureID);
	}

} //KindElterngeldTypeImpl
