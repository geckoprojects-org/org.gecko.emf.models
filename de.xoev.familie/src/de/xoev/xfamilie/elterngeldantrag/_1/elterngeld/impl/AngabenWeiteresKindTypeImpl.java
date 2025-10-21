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
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonNachweisbezugType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeKindschaftsverhaeltnisType;
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
 * An implementation of the model object '<em><b>Angaben Weiteres Kind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenWeiteresKindTypeImpl#getNameWeiteresKind <em>Name Weiteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenWeiteresKindTypeImpl#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenWeiteresKindTypeImpl#getGeburtsdatumNachweis <em>Geburtsdatum Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenWeiteresKindTypeImpl#getHaushaltsaufnahme <em>Haushaltsaufnahme</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenWeiteresKindTypeImpl#getHaushaltsaufnahmeNachweis <em>Haushaltsaufnahme Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenWeiteresKindTypeImpl#isBehinderungsgrad <em>Behinderungsgrad</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenWeiteresKindTypeImpl#getBehinderungsgradNachweis <em>Behinderungsgrad Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenWeiteresKindTypeImpl#getVerhaeltnisET1 <em>Verhaeltnis ET1</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenWeiteresKindTypeImpl#getVerhaeltnisET2 <em>Verhaeltnis ET2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenWeiteresKindTypeImpl extends MinimalEObjectImpl.Container implements AngabenWeiteresKindType {
	/**
	 * The cached value of the '{@link #getNameWeiteresKind() <em>Name Weiteres Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameWeiteresKind()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonNachweisbezugType nameWeiteresKind;

	/**
	 * The default value of the '{@link #getGeburtsdatum() <em>Geburtsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GEBURTSDATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeburtsdatum() <em>Geburtsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar geburtsdatum = GEBURTSDATUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeburtsdatumNachweis() <em>Geburtsdatum Nachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatumNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> geburtsdatumNachweis;

	/**
	 * The default value of the '{@link #getHaushaltsaufnahme() <em>Haushaltsaufnahme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaushaltsaufnahme()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HAUSHALTSAUFNAHME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHaushaltsaufnahme() <em>Haushaltsaufnahme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaushaltsaufnahme()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar haushaltsaufnahme = HAUSHALTSAUFNAHME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHaushaltsaufnahmeNachweis() <em>Haushaltsaufnahme Nachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaushaltsaufnahmeNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> haushaltsaufnahmeNachweis;

	/**
	 * The default value of the '{@link #isBehinderungsgrad() <em>Behinderungsgrad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBehinderungsgrad()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEHINDERUNGSGRAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBehinderungsgrad() <em>Behinderungsgrad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBehinderungsgrad()
	 * @generated
	 * @ordered
	 */
	protected boolean behinderungsgrad = BEHINDERUNGSGRAD_EDEFAULT;

	/**
	 * This is true if the Behinderungsgrad attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean behinderungsgradESet;

	/**
	 * The cached value of the '{@link #getBehinderungsgradNachweis() <em>Behinderungsgrad Nachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehinderungsgradNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> behinderungsgradNachweis;

	/**
	 * The cached value of the '{@link #getVerhaeltnisET1() <em>Verhaeltnis ET1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerhaeltnisET1()
	 * @generated
	 * @ordered
	 */
	protected CodeKindschaftsverhaeltnisType verhaeltnisET1;

	/**
	 * The cached value of the '{@link #getVerhaeltnisET2() <em>Verhaeltnis ET2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerhaeltnisET2()
	 * @generated
	 * @ordered
	 */
	protected CodeKindschaftsverhaeltnisType verhaeltnisET2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenWeiteresKindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getAngabenWeiteresKindType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonNachweisbezugType getNameWeiteresKind() {
		return nameWeiteresKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameWeiteresKind(NameNatuerlichePersonNachweisbezugType newNameWeiteresKind, NotificationChain msgs) {
		NameNatuerlichePersonNachweisbezugType oldNameWeiteresKind = nameWeiteresKind;
		nameWeiteresKind = newNameWeiteresKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__NAME_WEITERES_KIND, oldNameWeiteresKind, newNameWeiteresKind);
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
	public void setNameWeiteresKind(NameNatuerlichePersonNachweisbezugType newNameWeiteresKind) {
		if (newNameWeiteresKind != nameWeiteresKind) {
			NotificationChain msgs = null;
			if (nameWeiteresKind != null)
				msgs = ((InternalEObject)nameWeiteresKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__NAME_WEITERES_KIND, null, msgs);
			if (newNameWeiteresKind != null)
				msgs = ((InternalEObject)newNameWeiteresKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__NAME_WEITERES_KIND, null, msgs);
			msgs = basicSetNameWeiteresKind(newNameWeiteresKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__NAME_WEITERES_KIND, newNameWeiteresKind, newNameWeiteresKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getGeburtsdatum() {
		return geburtsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeburtsdatum(XMLGregorianCalendar newGeburtsdatum) {
		XMLGregorianCalendar oldGeburtsdatum = geburtsdatum;
		geburtsdatum = newGeburtsdatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__GEBURTSDATUM, oldGeburtsdatum, geburtsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getGeburtsdatumNachweis() {
		if (geburtsdatumNachweis == null) {
			geburtsdatumNachweis = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__GEBURTSDATUM_NACHWEIS);
		}
		return geburtsdatumNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getHaushaltsaufnahme() {
		return haushaltsaufnahme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHaushaltsaufnahme(XMLGregorianCalendar newHaushaltsaufnahme) {
		XMLGregorianCalendar oldHaushaltsaufnahme = haushaltsaufnahme;
		haushaltsaufnahme = newHaushaltsaufnahme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__HAUSHALTSAUFNAHME, oldHaushaltsaufnahme, haushaltsaufnahme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getHaushaltsaufnahmeNachweis() {
		if (haushaltsaufnahmeNachweis == null) {
			haushaltsaufnahmeNachweis = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__HAUSHALTSAUFNAHME_NACHWEIS);
		}
		return haushaltsaufnahmeNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBehinderungsgrad() {
		return behinderungsgrad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBehinderungsgrad(boolean newBehinderungsgrad) {
		boolean oldBehinderungsgrad = behinderungsgrad;
		behinderungsgrad = newBehinderungsgrad;
		boolean oldBehinderungsgradESet = behinderungsgradESet;
		behinderungsgradESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__BEHINDERUNGSGRAD, oldBehinderungsgrad, behinderungsgrad, !oldBehinderungsgradESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBehinderungsgrad() {
		boolean oldBehinderungsgrad = behinderungsgrad;
		boolean oldBehinderungsgradESet = behinderungsgradESet;
		behinderungsgrad = BEHINDERUNGSGRAD_EDEFAULT;
		behinderungsgradESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__BEHINDERUNGSGRAD, oldBehinderungsgrad, BEHINDERUNGSGRAD_EDEFAULT, oldBehinderungsgradESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBehinderungsgrad() {
		return behinderungsgradESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getBehinderungsgradNachweis() {
		if (behinderungsgradNachweis == null) {
			behinderungsgradNachweis = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__BEHINDERUNGSGRAD_NACHWEIS);
		}
		return behinderungsgradNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKindschaftsverhaeltnisType getVerhaeltnisET1() {
		return verhaeltnisET1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerhaeltnisET1(CodeKindschaftsverhaeltnisType newVerhaeltnisET1, NotificationChain msgs) {
		CodeKindschaftsverhaeltnisType oldVerhaeltnisET1 = verhaeltnisET1;
		verhaeltnisET1 = newVerhaeltnisET1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET1, oldVerhaeltnisET1, newVerhaeltnisET1);
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
	public void setVerhaeltnisET1(CodeKindschaftsverhaeltnisType newVerhaeltnisET1) {
		if (newVerhaeltnisET1 != verhaeltnisET1) {
			NotificationChain msgs = null;
			if (verhaeltnisET1 != null)
				msgs = ((InternalEObject)verhaeltnisET1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET1, null, msgs);
			if (newVerhaeltnisET1 != null)
				msgs = ((InternalEObject)newVerhaeltnisET1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET1, null, msgs);
			msgs = basicSetVerhaeltnisET1(newVerhaeltnisET1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET1, newVerhaeltnisET1, newVerhaeltnisET1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKindschaftsverhaeltnisType getVerhaeltnisET2() {
		return verhaeltnisET2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerhaeltnisET2(CodeKindschaftsverhaeltnisType newVerhaeltnisET2, NotificationChain msgs) {
		CodeKindschaftsverhaeltnisType oldVerhaeltnisET2 = verhaeltnisET2;
		verhaeltnisET2 = newVerhaeltnisET2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET2, oldVerhaeltnisET2, newVerhaeltnisET2);
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
	public void setVerhaeltnisET2(CodeKindschaftsverhaeltnisType newVerhaeltnisET2) {
		if (newVerhaeltnisET2 != verhaeltnisET2) {
			NotificationChain msgs = null;
			if (verhaeltnisET2 != null)
				msgs = ((InternalEObject)verhaeltnisET2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET2, null, msgs);
			if (newVerhaeltnisET2 != null)
				msgs = ((InternalEObject)newVerhaeltnisET2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET2, null, msgs);
			msgs = basicSetVerhaeltnisET2(newVerhaeltnisET2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET2, newVerhaeltnisET2, newVerhaeltnisET2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__NAME_WEITERES_KIND:
				return basicSetNameWeiteresKind(null, msgs);
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__GEBURTSDATUM_NACHWEIS:
				return ((InternalEList<?>)getGeburtsdatumNachweis()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__HAUSHALTSAUFNAHME_NACHWEIS:
				return ((InternalEList<?>)getHaushaltsaufnahmeNachweis()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__BEHINDERUNGSGRAD_NACHWEIS:
				return ((InternalEList<?>)getBehinderungsgradNachweis()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET1:
				return basicSetVerhaeltnisET1(null, msgs);
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET2:
				return basicSetVerhaeltnisET2(null, msgs);
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
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__NAME_WEITERES_KIND:
				return getNameWeiteresKind();
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__GEBURTSDATUM:
				return getGeburtsdatum();
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__GEBURTSDATUM_NACHWEIS:
				return getGeburtsdatumNachweis();
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__HAUSHALTSAUFNAHME:
				return getHaushaltsaufnahme();
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__HAUSHALTSAUFNAHME_NACHWEIS:
				return getHaushaltsaufnahmeNachweis();
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__BEHINDERUNGSGRAD:
				return isBehinderungsgrad();
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__BEHINDERUNGSGRAD_NACHWEIS:
				return getBehinderungsgradNachweis();
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET1:
				return getVerhaeltnisET1();
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET2:
				return getVerhaeltnisET2();
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
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__NAME_WEITERES_KIND:
				setNameWeiteresKind((NameNatuerlichePersonNachweisbezugType)newValue);
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__GEBURTSDATUM:
				setGeburtsdatum((XMLGregorianCalendar)newValue);
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__GEBURTSDATUM_NACHWEIS:
				getGeburtsdatumNachweis().clear();
				getGeburtsdatumNachweis().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__HAUSHALTSAUFNAHME:
				setHaushaltsaufnahme((XMLGregorianCalendar)newValue);
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__HAUSHALTSAUFNAHME_NACHWEIS:
				getHaushaltsaufnahmeNachweis().clear();
				getHaushaltsaufnahmeNachweis().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__BEHINDERUNGSGRAD:
				setBehinderungsgrad((Boolean)newValue);
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__BEHINDERUNGSGRAD_NACHWEIS:
				getBehinderungsgradNachweis().clear();
				getBehinderungsgradNachweis().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET1:
				setVerhaeltnisET1((CodeKindschaftsverhaeltnisType)newValue);
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET2:
				setVerhaeltnisET2((CodeKindschaftsverhaeltnisType)newValue);
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
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__NAME_WEITERES_KIND:
				setNameWeiteresKind((NameNatuerlichePersonNachweisbezugType)null);
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__GEBURTSDATUM:
				setGeburtsdatum(GEBURTSDATUM_EDEFAULT);
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__GEBURTSDATUM_NACHWEIS:
				getGeburtsdatumNachweis().clear();
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__HAUSHALTSAUFNAHME:
				setHaushaltsaufnahme(HAUSHALTSAUFNAHME_EDEFAULT);
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__HAUSHALTSAUFNAHME_NACHWEIS:
				getHaushaltsaufnahmeNachweis().clear();
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__BEHINDERUNGSGRAD:
				unsetBehinderungsgrad();
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__BEHINDERUNGSGRAD_NACHWEIS:
				getBehinderungsgradNachweis().clear();
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET1:
				setVerhaeltnisET1((CodeKindschaftsverhaeltnisType)null);
				return;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET2:
				setVerhaeltnisET2((CodeKindschaftsverhaeltnisType)null);
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
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__NAME_WEITERES_KIND:
				return nameWeiteresKind != null;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__GEBURTSDATUM:
				return GEBURTSDATUM_EDEFAULT == null ? geburtsdatum != null : !GEBURTSDATUM_EDEFAULT.equals(geburtsdatum);
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__GEBURTSDATUM_NACHWEIS:
				return geburtsdatumNachweis != null && !geburtsdatumNachweis.isEmpty();
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__HAUSHALTSAUFNAHME:
				return HAUSHALTSAUFNAHME_EDEFAULT == null ? haushaltsaufnahme != null : !HAUSHALTSAUFNAHME_EDEFAULT.equals(haushaltsaufnahme);
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__HAUSHALTSAUFNAHME_NACHWEIS:
				return haushaltsaufnahmeNachweis != null && !haushaltsaufnahmeNachweis.isEmpty();
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__BEHINDERUNGSGRAD:
				return isSetBehinderungsgrad();
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__BEHINDERUNGSGRAD_NACHWEIS:
				return behinderungsgradNachweis != null && !behinderungsgradNachweis.isEmpty();
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET1:
				return verhaeltnisET1 != null;
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE__VERHAELTNIS_ET2:
				return verhaeltnisET2 != null;
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
		result.append(" (geburtsdatum: ");
		result.append(geburtsdatum);
		result.append(", haushaltsaufnahme: ");
		result.append(haushaltsaufnahme);
		result.append(", behinderungsgrad: ");
		if (behinderungsgradESet) result.append(behinderungsgrad); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AngabenWeiteresKindTypeImpl
