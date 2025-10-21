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
package de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungRueckType;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Antragstellender Elternteil Mutterschaftsgeldmeldung Rueck Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AntragstellenderElternteilMutterschaftsgeldmeldungRueckTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AntragstellenderElternteilMutterschaftsgeldmeldungRueckTypeImpl#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AntragstellenderElternteilMutterschaftsgeldmeldungRueckTypeImpl#getKrankenversichertennummer <em>Krankenversichertennummer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AntragstellenderElternteilMutterschaftsgeldmeldungRueckTypeImpl extends MinimalEObjectImpl.Container implements AntragstellenderElternteilMutterschaftsgeldmeldungRueckType {
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
	protected TeilbekanntesDatumType geburt;

	/**
	 * The default value of the '{@link #getKrankenversichertennummer() <em>Krankenversichertennummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKrankenversichertennummer()
	 * @generated
	 * @ordered
	 */
	protected static final String KRANKENVERSICHERTENNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKrankenversichertennummer() <em>Krankenversichertennummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKrankenversichertennummer()
	 * @generated
	 * @ordered
	 */
	protected String krankenversichertennummer = KRANKENVERSICHERTENNUMMER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AntragstellenderElternteilMutterschaftsgeldmeldungRueckTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutterschaftsgeldPackage.Literals.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getGeburt() {
		return geburt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburt(TeilbekanntesDatumType newGeburt, NotificationChain msgs) {
		TeilbekanntesDatumType oldGeburt = geburt;
		geburt = newGeburt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__GEBURT, oldGeburt, newGeburt);
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
	public void setGeburt(TeilbekanntesDatumType newGeburt) {
		if (newGeburt != geburt) {
			NotificationChain msgs = null;
			if (geburt != null)
				msgs = ((InternalEObject)geburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__GEBURT, null, msgs);
			if (newGeburt != null)
				msgs = ((InternalEObject)newGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__GEBURT, null, msgs);
			msgs = basicSetGeburt(newGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__GEBURT, newGeburt, newGeburt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKrankenversichertennummer() {
		return krankenversichertennummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKrankenversichertennummer(String newKrankenversichertennummer) {
		String oldKrankenversichertennummer = krankenversichertennummer;
		krankenversichertennummer = newKrankenversichertennummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__KRANKENVERSICHERTENNUMMER, oldKrankenversichertennummer, krankenversichertennummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__NAME:
				return basicSetName(null, msgs);
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__GEBURT:
				return basicSetGeburt(null, msgs);
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
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__NAME:
				return getName();
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__GEBURT:
				return getGeburt();
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__KRANKENVERSICHERTENNUMMER:
				return getKrankenversichertennummer();
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
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__NAME:
				setName((NameNatuerlichePersonType)newValue);
				return;
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__GEBURT:
				setGeburt((TeilbekanntesDatumType)newValue);
				return;
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__KRANKENVERSICHERTENNUMMER:
				setKrankenversichertennummer((String)newValue);
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
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__NAME:
				setName((NameNatuerlichePersonType)null);
				return;
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__GEBURT:
				setGeburt((TeilbekanntesDatumType)null);
				return;
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__KRANKENVERSICHERTENNUMMER:
				setKrankenversichertennummer(KRANKENVERSICHERTENNUMMER_EDEFAULT);
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
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__NAME:
				return name != null;
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__GEBURT:
				return geburt != null;
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__KRANKENVERSICHERTENNUMMER:
				return KRANKENVERSICHERTENNUMMER_EDEFAULT == null ? krankenversichertennummer != null : !KRANKENVERSICHERTENNUMMER_EDEFAULT.equals(krankenversichertennummer);
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
		result.append(" (krankenversichertennummer: ");
		result.append(krankenversichertennummer);
		result.append(')');
		return result.toString();
	}

} //AntragstellenderElternteilMutterschaftsgeldmeldungRueckTypeImpl
