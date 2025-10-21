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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeAnredeType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType;

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
 * An implementation of the model object '<em><b>Gesetzliche Vertretung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GesetzlicheVertretungTypeImpl#getAnredeGesetzlicheVertretung <em>Anrede Gesetzliche Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GesetzlicheVertretungTypeImpl#getNameGesetzlicheVertretung <em>Name Gesetzliche Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GesetzlicheVertretungTypeImpl#getAnschriftGesetzlicheVertretung <em>Anschrift Gesetzliche Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GesetzlicheVertretungTypeImpl#getNutzerkontoGesetzlicheVertretung <em>Nutzerkonto Gesetzliche Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GesetzlicheVertretungTypeImpl#getNachweisGesetzlicheVertretung <em>Nachweis Gesetzliche Vertretung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GesetzlicheVertretungTypeImpl extends MinimalEObjectImpl.Container implements GesetzlicheVertretungType {
	/**
	 * The cached value of the '{@link #getAnredeGesetzlicheVertretung() <em>Anrede Gesetzliche Vertretung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnredeGesetzlicheVertretung()
	 * @generated
	 * @ordered
	 */
	protected CodeAnredeType anredeGesetzlicheVertretung;

	/**
	 * The cached value of the '{@link #getNameGesetzlicheVertretung() <em>Name Gesetzliche Vertretung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameGesetzlicheVertretung()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonType nameGesetzlicheVertretung;

	/**
	 * The cached value of the '{@link #getAnschriftGesetzlicheVertretung() <em>Anschrift Gesetzliche Vertretung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschriftGesetzlicheVertretung()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType anschriftGesetzlicheVertretung;

	/**
	 * The cached value of the '{@link #getNutzerkontoGesetzlicheVertretung() <em>Nutzerkonto Gesetzliche Vertretung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutzerkontoGesetzlicheVertretung()
	 * @generated
	 * @ordered
	 */
	protected NutzerkontoType nutzerkontoGesetzlicheVertretung;

	/**
	 * The cached value of the '{@link #getNachweisGesetzlicheVertretung() <em>Nachweis Gesetzliche Vertretung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisGesetzlicheVertretung()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisGesetzlicheVertretung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GesetzlicheVertretungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getGesetzlicheVertretungType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAnredeType getAnredeGesetzlicheVertretung() {
		return anredeGesetzlicheVertretung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnredeGesetzlicheVertretung(CodeAnredeType newAnredeGesetzlicheVertretung, NotificationChain msgs) {
		CodeAnredeType oldAnredeGesetzlicheVertretung = anredeGesetzlicheVertretung;
		anredeGesetzlicheVertretung = newAnredeGesetzlicheVertretung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANREDE_GESETZLICHE_VERTRETUNG, oldAnredeGesetzlicheVertretung, newAnredeGesetzlicheVertretung);
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
	public void setAnredeGesetzlicheVertretung(CodeAnredeType newAnredeGesetzlicheVertretung) {
		if (newAnredeGesetzlicheVertretung != anredeGesetzlicheVertretung) {
			NotificationChain msgs = null;
			if (anredeGesetzlicheVertretung != null)
				msgs = ((InternalEObject)anredeGesetzlicheVertretung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANREDE_GESETZLICHE_VERTRETUNG, null, msgs);
			if (newAnredeGesetzlicheVertretung != null)
				msgs = ((InternalEObject)newAnredeGesetzlicheVertretung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANREDE_GESETZLICHE_VERTRETUNG, null, msgs);
			msgs = basicSetAnredeGesetzlicheVertretung(newAnredeGesetzlicheVertretung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANREDE_GESETZLICHE_VERTRETUNG, newAnredeGesetzlicheVertretung, newAnredeGesetzlicheVertretung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType getNameGesetzlicheVertretung() {
		return nameGesetzlicheVertretung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameGesetzlicheVertretung(NameNatuerlichePersonType newNameGesetzlicheVertretung, NotificationChain msgs) {
		NameNatuerlichePersonType oldNameGesetzlicheVertretung = nameGesetzlicheVertretung;
		nameGesetzlicheVertretung = newNameGesetzlicheVertretung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NAME_GESETZLICHE_VERTRETUNG, oldNameGesetzlicheVertretung, newNameGesetzlicheVertretung);
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
	public void setNameGesetzlicheVertretung(NameNatuerlichePersonType newNameGesetzlicheVertretung) {
		if (newNameGesetzlicheVertretung != nameGesetzlicheVertretung) {
			NotificationChain msgs = null;
			if (nameGesetzlicheVertretung != null)
				msgs = ((InternalEObject)nameGesetzlicheVertretung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NAME_GESETZLICHE_VERTRETUNG, null, msgs);
			if (newNameGesetzlicheVertretung != null)
				msgs = ((InternalEObject)newNameGesetzlicheVertretung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NAME_GESETZLICHE_VERTRETUNG, null, msgs);
			msgs = basicSetNameGesetzlicheVertretung(newNameGesetzlicheVertretung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NAME_GESETZLICHE_VERTRETUNG, newNameGesetzlicheVertretung, newNameGesetzlicheVertretung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType getAnschriftGesetzlicheVertretung() {
		return anschriftGesetzlicheVertretung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschriftGesetzlicheVertretung(PostalischeInlandsanschriftBasisType newAnschriftGesetzlicheVertretung, NotificationChain msgs) {
		PostalischeInlandsanschriftBasisType oldAnschriftGesetzlicheVertretung = anschriftGesetzlicheVertretung;
		anschriftGesetzlicheVertretung = newAnschriftGesetzlicheVertretung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANSCHRIFT_GESETZLICHE_VERTRETUNG, oldAnschriftGesetzlicheVertretung, newAnschriftGesetzlicheVertretung);
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
	public void setAnschriftGesetzlicheVertretung(PostalischeInlandsanschriftBasisType newAnschriftGesetzlicheVertretung) {
		if (newAnschriftGesetzlicheVertretung != anschriftGesetzlicheVertretung) {
			NotificationChain msgs = null;
			if (anschriftGesetzlicheVertretung != null)
				msgs = ((InternalEObject)anschriftGesetzlicheVertretung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANSCHRIFT_GESETZLICHE_VERTRETUNG, null, msgs);
			if (newAnschriftGesetzlicheVertretung != null)
				msgs = ((InternalEObject)newAnschriftGesetzlicheVertretung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANSCHRIFT_GESETZLICHE_VERTRETUNG, null, msgs);
			msgs = basicSetAnschriftGesetzlicheVertretung(newAnschriftGesetzlicheVertretung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANSCHRIFT_GESETZLICHE_VERTRETUNG, newAnschriftGesetzlicheVertretung, newAnschriftGesetzlicheVertretung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutzerkontoType getNutzerkontoGesetzlicheVertretung() {
		return nutzerkontoGesetzlicheVertretung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNutzerkontoGesetzlicheVertretung(NutzerkontoType newNutzerkontoGesetzlicheVertretung, NotificationChain msgs) {
		NutzerkontoType oldNutzerkontoGesetzlicheVertretung = nutzerkontoGesetzlicheVertretung;
		nutzerkontoGesetzlicheVertretung = newNutzerkontoGesetzlicheVertretung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NUTZERKONTO_GESETZLICHE_VERTRETUNG, oldNutzerkontoGesetzlicheVertretung, newNutzerkontoGesetzlicheVertretung);
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
	public void setNutzerkontoGesetzlicheVertretung(NutzerkontoType newNutzerkontoGesetzlicheVertretung) {
		if (newNutzerkontoGesetzlicheVertretung != nutzerkontoGesetzlicheVertretung) {
			NotificationChain msgs = null;
			if (nutzerkontoGesetzlicheVertretung != null)
				msgs = ((InternalEObject)nutzerkontoGesetzlicheVertretung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NUTZERKONTO_GESETZLICHE_VERTRETUNG, null, msgs);
			if (newNutzerkontoGesetzlicheVertretung != null)
				msgs = ((InternalEObject)newNutzerkontoGesetzlicheVertretung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NUTZERKONTO_GESETZLICHE_VERTRETUNG, null, msgs);
			msgs = basicSetNutzerkontoGesetzlicheVertretung(newNutzerkontoGesetzlicheVertretung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NUTZERKONTO_GESETZLICHE_VERTRETUNG, newNutzerkontoGesetzlicheVertretung, newNutzerkontoGesetzlicheVertretung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisGesetzlicheVertretung() {
		if (nachweisGesetzlicheVertretung == null) {
			nachweisGesetzlicheVertretung = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NACHWEIS_GESETZLICHE_VERTRETUNG);
		}
		return nachweisGesetzlicheVertretung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANREDE_GESETZLICHE_VERTRETUNG:
				return basicSetAnredeGesetzlicheVertretung(null, msgs);
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NAME_GESETZLICHE_VERTRETUNG:
				return basicSetNameGesetzlicheVertretung(null, msgs);
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANSCHRIFT_GESETZLICHE_VERTRETUNG:
				return basicSetAnschriftGesetzlicheVertretung(null, msgs);
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NUTZERKONTO_GESETZLICHE_VERTRETUNG:
				return basicSetNutzerkontoGesetzlicheVertretung(null, msgs);
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NACHWEIS_GESETZLICHE_VERTRETUNG:
				return ((InternalEList<?>)getNachweisGesetzlicheVertretung()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANREDE_GESETZLICHE_VERTRETUNG:
				return getAnredeGesetzlicheVertretung();
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NAME_GESETZLICHE_VERTRETUNG:
				return getNameGesetzlicheVertretung();
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANSCHRIFT_GESETZLICHE_VERTRETUNG:
				return getAnschriftGesetzlicheVertretung();
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NUTZERKONTO_GESETZLICHE_VERTRETUNG:
				return getNutzerkontoGesetzlicheVertretung();
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NACHWEIS_GESETZLICHE_VERTRETUNG:
				return getNachweisGesetzlicheVertretung();
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
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANREDE_GESETZLICHE_VERTRETUNG:
				setAnredeGesetzlicheVertretung((CodeAnredeType)newValue);
				return;
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NAME_GESETZLICHE_VERTRETUNG:
				setNameGesetzlicheVertretung((NameNatuerlichePersonType)newValue);
				return;
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANSCHRIFT_GESETZLICHE_VERTRETUNG:
				setAnschriftGesetzlicheVertretung((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NUTZERKONTO_GESETZLICHE_VERTRETUNG:
				setNutzerkontoGesetzlicheVertretung((NutzerkontoType)newValue);
				return;
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NACHWEIS_GESETZLICHE_VERTRETUNG:
				getNachweisGesetzlicheVertretung().clear();
				getNachweisGesetzlicheVertretung().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANREDE_GESETZLICHE_VERTRETUNG:
				setAnredeGesetzlicheVertretung((CodeAnredeType)null);
				return;
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NAME_GESETZLICHE_VERTRETUNG:
				setNameGesetzlicheVertretung((NameNatuerlichePersonType)null);
				return;
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANSCHRIFT_GESETZLICHE_VERTRETUNG:
				setAnschriftGesetzlicheVertretung((PostalischeInlandsanschriftBasisType)null);
				return;
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NUTZERKONTO_GESETZLICHE_VERTRETUNG:
				setNutzerkontoGesetzlicheVertretung((NutzerkontoType)null);
				return;
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NACHWEIS_GESETZLICHE_VERTRETUNG:
				getNachweisGesetzlicheVertretung().clear();
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
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANREDE_GESETZLICHE_VERTRETUNG:
				return anredeGesetzlicheVertretung != null;
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NAME_GESETZLICHE_VERTRETUNG:
				return nameGesetzlicheVertretung != null;
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__ANSCHRIFT_GESETZLICHE_VERTRETUNG:
				return anschriftGesetzlicheVertretung != null;
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NUTZERKONTO_GESETZLICHE_VERTRETUNG:
				return nutzerkontoGesetzlicheVertretung != null;
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE__NACHWEIS_GESETZLICHE_VERTRETUNG:
				return nachweisGesetzlicheVertretung != null && !nachweisGesetzlicheVertretung.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GesetzlicheVertretungTypeImpl
