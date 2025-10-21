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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeVertrauensniveauType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType;

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
 * An implementation of the model object '<em><b>Nutzerkonto Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NutzerkontoTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NutzerkontoTypeImpl#getVertrauensniveau <em>Vertrauensniveau</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NutzerkontoTypeImpl#getNachweisNutzerkonto <em>Nachweis Nutzerkonto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutzerkontoTypeImpl extends MinimalEObjectImpl.Container implements NutzerkontoType {
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
	 * The cached value of the '{@link #getVertrauensniveau() <em>Vertrauensniveau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertrauensniveau()
	 * @generated
	 * @ordered
	 */
	protected CodeVertrauensniveauType vertrauensniveau;

	/**
	 * The cached value of the '{@link #getNachweisNutzerkonto() <em>Nachweis Nutzerkonto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisNutzerkonto()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisNutzerkonto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutzerkontoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.NUTZERKONTO_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.NUTZERKONTO_TYPE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NUTZERKONTO_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NUTZERKONTO_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NUTZERKONTO_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVertrauensniveauType getVertrauensniveau() {
		return vertrauensniveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVertrauensniveau(CodeVertrauensniveauType newVertrauensniveau, NotificationChain msgs) {
		CodeVertrauensniveauType oldVertrauensniveau = vertrauensniveau;
		vertrauensniveau = newVertrauensniveau;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.NUTZERKONTO_TYPE__VERTRAUENSNIVEAU, oldVertrauensniveau, newVertrauensniveau);
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
	public void setVertrauensniveau(CodeVertrauensniveauType newVertrauensniveau) {
		if (newVertrauensniveau != vertrauensniveau) {
			NotificationChain msgs = null;
			if (vertrauensniveau != null)
				msgs = ((InternalEObject)vertrauensniveau).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NUTZERKONTO_TYPE__VERTRAUENSNIVEAU, null, msgs);
			if (newVertrauensniveau != null)
				msgs = ((InternalEObject)newVertrauensniveau).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NUTZERKONTO_TYPE__VERTRAUENSNIVEAU, null, msgs);
			msgs = basicSetVertrauensniveau(newVertrauensniveau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NUTZERKONTO_TYPE__VERTRAUENSNIVEAU, newVertrauensniveau, newVertrauensniveau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisNutzerkonto() {
		if (nachweisNutzerkonto == null) {
			nachweisNutzerkonto = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, BaukastenPackage.NUTZERKONTO_TYPE__NACHWEIS_NUTZERKONTO);
		}
		return nachweisNutzerkonto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.NUTZERKONTO_TYPE__NAME:
				return basicSetName(null, msgs);
			case BaukastenPackage.NUTZERKONTO_TYPE__VERTRAUENSNIVEAU:
				return basicSetVertrauensniveau(null, msgs);
			case BaukastenPackage.NUTZERKONTO_TYPE__NACHWEIS_NUTZERKONTO:
				return ((InternalEList<?>)getNachweisNutzerkonto()).basicRemove(otherEnd, msgs);
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
			case BaukastenPackage.NUTZERKONTO_TYPE__NAME:
				return getName();
			case BaukastenPackage.NUTZERKONTO_TYPE__VERTRAUENSNIVEAU:
				return getVertrauensniveau();
			case BaukastenPackage.NUTZERKONTO_TYPE__NACHWEIS_NUTZERKONTO:
				return getNachweisNutzerkonto();
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
			case BaukastenPackage.NUTZERKONTO_TYPE__NAME:
				setName((NameNatuerlichePersonType)newValue);
				return;
			case BaukastenPackage.NUTZERKONTO_TYPE__VERTRAUENSNIVEAU:
				setVertrauensniveau((CodeVertrauensniveauType)newValue);
				return;
			case BaukastenPackage.NUTZERKONTO_TYPE__NACHWEIS_NUTZERKONTO:
				getNachweisNutzerkonto().clear();
				getNachweisNutzerkonto().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case BaukastenPackage.NUTZERKONTO_TYPE__NAME:
				setName((NameNatuerlichePersonType)null);
				return;
			case BaukastenPackage.NUTZERKONTO_TYPE__VERTRAUENSNIVEAU:
				setVertrauensniveau((CodeVertrauensniveauType)null);
				return;
			case BaukastenPackage.NUTZERKONTO_TYPE__NACHWEIS_NUTZERKONTO:
				getNachweisNutzerkonto().clear();
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
			case BaukastenPackage.NUTZERKONTO_TYPE__NAME:
				return name != null;
			case BaukastenPackage.NUTZERKONTO_TYPE__VERTRAUENSNIVEAU:
				return vertrauensniveau != null;
			case BaukastenPackage.NUTZERKONTO_TYPE__NACHWEIS_NUTZERKONTO:
				return nachweisNutzerkonto != null && !nachweisNutzerkonto.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NutzerkontoTypeImpl
