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
import de.xoev.xfamilie.baukasten._1.baukasten.FeldType;
import de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType;
import de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType;

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
 * An implementation of the model object '<em><b>Zusatzparametergruppe Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ZusatzparametergruppeTypeImpl#getFeld <em>Feld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ZusatzparametergruppeTypeImpl#getFeldgruppe <em>Feldgruppe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ZusatzparametergruppeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ZusatzparametergruppeTypeImpl#getFassungHandlungsanweisung <em>Fassung Handlungsanweisung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZusatzparametergruppeTypeImpl extends MinimalEObjectImpl.Container implements ZusatzparametergruppeType {
	/**
	 * The cached value of the '{@link #getFeld() <em>Feld</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeld()
	 * @generated
	 * @ordered
	 */
	protected EList<FeldType> feld;

	/**
	 * The cached value of the '{@link #getFeldgruppe() <em>Feldgruppe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeldgruppe()
	 * @generated
	 * @ordered
	 */
	protected EList<FeldgruppeType> feldgruppe;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFassungHandlungsanweisung() <em>Fassung Handlungsanweisung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFassungHandlungsanweisung()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FASSUNG_HANDLUNGSANWEISUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFassungHandlungsanweisung() <em>Fassung Handlungsanweisung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFassungHandlungsanweisung()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar fassungHandlungsanweisung = FASSUNG_HANDLUNGSANWEISUNG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZusatzparametergruppeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.ZUSATZPARAMETERGRUPPE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeldType> getFeld() {
		if (feld == null) {
			feld = new EObjectContainmentEList<FeldType>(FeldType.class, this, BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FELD);
		}
		return feld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeldgruppeType> getFeldgruppe() {
		if (feldgruppe == null) {
			feldgruppe = new EObjectContainmentEList<FeldgruppeType>(FeldgruppeType.class, this, BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FELDGRUPPE);
		}
		return feldgruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getFassungHandlungsanweisung() {
		return fassungHandlungsanweisung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFassungHandlungsanweisung(XMLGregorianCalendar newFassungHandlungsanweisung) {
		XMLGregorianCalendar oldFassungHandlungsanweisung = fassungHandlungsanweisung;
		fassungHandlungsanweisung = newFassungHandlungsanweisung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FASSUNG_HANDLUNGSANWEISUNG, oldFassungHandlungsanweisung, fassungHandlungsanweisung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FELD:
				return ((InternalEList<?>)getFeld()).basicRemove(otherEnd, msgs);
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FELDGRUPPE:
				return ((InternalEList<?>)getFeldgruppe()).basicRemove(otherEnd, msgs);
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
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FELD:
				return getFeld();
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FELDGRUPPE:
				return getFeldgruppe();
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__NAME:
				return getName();
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FASSUNG_HANDLUNGSANWEISUNG:
				return getFassungHandlungsanweisung();
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
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FELD:
				getFeld().clear();
				getFeld().addAll((Collection<? extends FeldType>)newValue);
				return;
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FELDGRUPPE:
				getFeldgruppe().clear();
				getFeldgruppe().addAll((Collection<? extends FeldgruppeType>)newValue);
				return;
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__NAME:
				setName((String)newValue);
				return;
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FASSUNG_HANDLUNGSANWEISUNG:
				setFassungHandlungsanweisung((XMLGregorianCalendar)newValue);
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
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FELD:
				getFeld().clear();
				return;
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FELDGRUPPE:
				getFeldgruppe().clear();
				return;
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FASSUNG_HANDLUNGSANWEISUNG:
				setFassungHandlungsanweisung(FASSUNG_HANDLUNGSANWEISUNG_EDEFAULT);
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
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FELD:
				return feld != null && !feld.isEmpty();
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FELDGRUPPE:
				return feldgruppe != null && !feldgruppe.isEmpty();
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BaukastenPackage.ZUSATZPARAMETERGRUPPE_TYPE__FASSUNG_HANDLUNGSANWEISUNG:
				return FASSUNG_HANDLUNGSANWEISUNG_EDEFAULT == null ? fassungHandlungsanweisung != null : !FASSUNG_HANDLUNGSANWEISUNG_EDEFAULT.equals(fassungHandlungsanweisung);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", fassungHandlungsanweisung: ");
		result.append(fassungHandlungsanweisung);
		result.append(')');
		return result.toString();
	}

} //ZusatzparametergruppeTypeImpl
