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

import de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtType;
import de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;

import de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType;
import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;

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
 * An implementation of the model object '<em><b>Angaben Gesetzlicher Vertreter Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenGesetzlicherVertreterElternteilTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenGesetzlicherVertreterElternteilTypeImpl#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenGesetzlicherVertreterElternteilTypeImpl#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenGesetzlicherVertreterElternteilTypeImpl#getAnschriftAusland <em>Anschrift Ausland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenGesetzlicherVertreterElternteilTypeImpl#getKontakt <em>Kontakt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenGesetzlicherVertreterElternteilTypeImpl extends MinimalEObjectImpl.Container implements AngabenGesetzlicherVertreterElternteilType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonType name;

	/**
	 * The cached value of the '{@link #getGeburt() <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburt()
	 * @generated
	 * @ordered
	 */
	protected GeburtType geburt;

	/**
	 * The cached value of the '{@link #getAnschrift() <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected MeldeanschriftType anschrift;

	/**
	 * The cached value of the '{@link #getAnschriftAusland() <em>Anschrift Ausland</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschriftAusland()
	 * @generated
	 * @ordered
	 */
	protected AuslandsanschriftType anschriftAusland;

	/**
	 * The cached value of the '{@link #getKontakt() <em>Kontakt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontakt()
	 * @generated
	 * @ordered
	 */
	protected EList<ErreichbarkeitType> kontakt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenGesetzlicherVertreterElternteilTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeburtPackage.Literals.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameNatuerlichePersonType newName, NotificationChain msgs) {
		NameNatuerlichePersonType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__NAME, oldName, newName);
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
	public void setName(NameNatuerlichePersonType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtType getGeburt() {
		return geburt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburt(GeburtType newGeburt, NotificationChain msgs) {
		GeburtType oldGeburt = geburt;
		geburt = newGeburt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__GEBURT, oldGeburt, newGeburt);
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
	public void setGeburt(GeburtType newGeburt) {
		if (newGeburt != geburt) {
			NotificationChain msgs = null;
			if (geburt != null)
				msgs = ((InternalEObject)geburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__GEBURT, null, msgs);
			if (newGeburt != null)
				msgs = ((InternalEObject)newGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__GEBURT, null, msgs);
			msgs = basicSetGeburt(newGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__GEBURT, newGeburt, newGeburt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeldeanschriftType getAnschrift() {
		return anschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschrift(MeldeanschriftType newAnschrift, NotificationChain msgs) {
		MeldeanschriftType oldAnschrift = anschrift;
		anschrift = newAnschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT, oldAnschrift, newAnschrift);
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
	public void setAnschrift(MeldeanschriftType newAnschrift) {
		if (newAnschrift != anschrift) {
			NotificationChain msgs = null;
			if (anschrift != null)
				msgs = ((InternalEObject)anschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT, null, msgs);
			if (newAnschrift != null)
				msgs = ((InternalEObject)newAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT, null, msgs);
			msgs = basicSetAnschrift(newAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT, newAnschrift, newAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuslandsanschriftType getAnschriftAusland() {
		return anschriftAusland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschriftAusland(AuslandsanschriftType newAnschriftAusland, NotificationChain msgs) {
		AuslandsanschriftType oldAnschriftAusland = anschriftAusland;
		anschriftAusland = newAnschriftAusland;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT_AUSLAND, oldAnschriftAusland, newAnschriftAusland);
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
	public void setAnschriftAusland(AuslandsanschriftType newAnschriftAusland) {
		if (newAnschriftAusland != anschriftAusland) {
			NotificationChain msgs = null;
			if (anschriftAusland != null)
				msgs = ((InternalEObject)anschriftAusland).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT_AUSLAND, null, msgs);
			if (newAnschriftAusland != null)
				msgs = ((InternalEObject)newAnschriftAusland).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT_AUSLAND, null, msgs);
			msgs = basicSetAnschriftAusland(newAnschriftAusland, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT_AUSLAND, newAnschriftAusland, newAnschriftAusland));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErreichbarkeitType> getKontakt() {
		if (kontakt == null) {
			kontakt = new EObjectContainmentEList<ErreichbarkeitType>(ErreichbarkeitType.class, this, GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__KONTAKT);
		}
		return kontakt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__NAME:
				return basicSetName(null, msgs);
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__GEBURT:
				return basicSetGeburt(null, msgs);
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT:
				return basicSetAnschrift(null, msgs);
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT_AUSLAND:
				return basicSetAnschriftAusland(null, msgs);
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__KONTAKT:
				return ((InternalEList<?>)getKontakt()).basicRemove(otherEnd, msgs);
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
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__NAME:
				return getName();
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__GEBURT:
				return getGeburt();
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT:
				return getAnschrift();
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT_AUSLAND:
				return getAnschriftAusland();
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__KONTAKT:
				return getKontakt();
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
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__NAME:
				setName((NameNatuerlichePersonType)newValue);
				return;
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__GEBURT:
				setGeburt((GeburtType)newValue);
				return;
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT:
				setAnschrift((MeldeanschriftType)newValue);
				return;
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT_AUSLAND:
				setAnschriftAusland((AuslandsanschriftType)newValue);
				return;
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__KONTAKT:
				getKontakt().clear();
				getKontakt().addAll((Collection<? extends ErreichbarkeitType>)newValue);
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
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__NAME:
				setName((NameNatuerlichePersonType)null);
				return;
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__GEBURT:
				setGeburt((GeburtType)null);
				return;
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT:
				setAnschrift((MeldeanschriftType)null);
				return;
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT_AUSLAND:
				setAnschriftAusland((AuslandsanschriftType)null);
				return;
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__KONTAKT:
				getKontakt().clear();
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
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__NAME:
				return name != null;
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__GEBURT:
				return geburt != null;
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT:
				return anschrift != null;
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT_AUSLAND:
				return anschriftAusland != null;
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__KONTAKT:
				return kontakt != null && !kontakt.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AngabenGesetzlicherVertreterElternteilTypeImpl
