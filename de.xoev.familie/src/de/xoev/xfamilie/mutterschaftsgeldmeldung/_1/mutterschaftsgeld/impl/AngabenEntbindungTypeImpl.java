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

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenEntbindungType;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage;

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
 * An implementation of the model object '<em><b>Angaben Entbindung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AngabenEntbindungTypeImpl#getAngabenMutterschaftsgeld <em>Angaben Mutterschaftsgeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AngabenEntbindungTypeImpl#getEntbindungstagKrankenkasse <em>Entbindungstag Krankenkasse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenEntbindungTypeImpl extends MinimalEObjectImpl.Container implements AngabenEntbindungType {
	/**
	 * The cached value of the '{@link #getAngabenMutterschaftsgeld() <em>Angaben Mutterschaftsgeld</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenMutterschaftsgeld()
	 * @generated
	 * @ordered
	 */
	protected EList<AngabenMutterschaftsgeldType> angabenMutterschaftsgeld;

	/**
	 * The default value of the '{@link #getEntbindungstagKrankenkasse() <em>Entbindungstag Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntbindungstagKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ENTBINDUNGSTAG_KRANKENKASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntbindungstagKrankenkasse() <em>Entbindungstag Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntbindungstagKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar entbindungstagKrankenkasse = ENTBINDUNGSTAG_KRANKENKASSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenEntbindungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutterschaftsgeldPackage.Literals.ANGABEN_ENTBINDUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AngabenMutterschaftsgeldType> getAngabenMutterschaftsgeld() {
		if (angabenMutterschaftsgeld == null) {
			angabenMutterschaftsgeld = new EObjectContainmentEList<AngabenMutterschaftsgeldType>(AngabenMutterschaftsgeldType.class, this, MutterschaftsgeldPackage.ANGABEN_ENTBINDUNG_TYPE__ANGABEN_MUTTERSCHAFTSGELD);
		}
		return angabenMutterschaftsgeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEntbindungstagKrankenkasse() {
		return entbindungstagKrankenkasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntbindungstagKrankenkasse(XMLGregorianCalendar newEntbindungstagKrankenkasse) {
		XMLGregorianCalendar oldEntbindungstagKrankenkasse = entbindungstagKrankenkasse;
		entbindungstagKrankenkasse = newEntbindungstagKrankenkasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.ANGABEN_ENTBINDUNG_TYPE__ENTBINDUNGSTAG_KRANKENKASSE, oldEntbindungstagKrankenkasse, entbindungstagKrankenkasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutterschaftsgeldPackage.ANGABEN_ENTBINDUNG_TYPE__ANGABEN_MUTTERSCHAFTSGELD:
				return ((InternalEList<?>)getAngabenMutterschaftsgeld()).basicRemove(otherEnd, msgs);
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
			case MutterschaftsgeldPackage.ANGABEN_ENTBINDUNG_TYPE__ANGABEN_MUTTERSCHAFTSGELD:
				return getAngabenMutterschaftsgeld();
			case MutterschaftsgeldPackage.ANGABEN_ENTBINDUNG_TYPE__ENTBINDUNGSTAG_KRANKENKASSE:
				return getEntbindungstagKrankenkasse();
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
			case MutterschaftsgeldPackage.ANGABEN_ENTBINDUNG_TYPE__ANGABEN_MUTTERSCHAFTSGELD:
				getAngabenMutterschaftsgeld().clear();
				getAngabenMutterschaftsgeld().addAll((Collection<? extends AngabenMutterschaftsgeldType>)newValue);
				return;
			case MutterschaftsgeldPackage.ANGABEN_ENTBINDUNG_TYPE__ENTBINDUNGSTAG_KRANKENKASSE:
				setEntbindungstagKrankenkasse((XMLGregorianCalendar)newValue);
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
			case MutterschaftsgeldPackage.ANGABEN_ENTBINDUNG_TYPE__ANGABEN_MUTTERSCHAFTSGELD:
				getAngabenMutterschaftsgeld().clear();
				return;
			case MutterschaftsgeldPackage.ANGABEN_ENTBINDUNG_TYPE__ENTBINDUNGSTAG_KRANKENKASSE:
				setEntbindungstagKrankenkasse(ENTBINDUNGSTAG_KRANKENKASSE_EDEFAULT);
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
			case MutterschaftsgeldPackage.ANGABEN_ENTBINDUNG_TYPE__ANGABEN_MUTTERSCHAFTSGELD:
				return angabenMutterschaftsgeld != null && !angabenMutterschaftsgeld.isEmpty();
			case MutterschaftsgeldPackage.ANGABEN_ENTBINDUNG_TYPE__ENTBINDUNGSTAG_KRANKENKASSE:
				return ENTBINDUNGSTAG_KRANKENKASSE_EDEFAULT == null ? entbindungstagKrankenkasse != null : !ENTBINDUNGSTAG_KRANKENKASSE_EDEFAULT.equals(entbindungstagKrankenkasse);
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
		result.append(" (entbindungstagKrankenkasse: ");
		result.append(entbindungstagKrankenkasse);
		result.append(')');
		return result.toString();
	}

} //AngabenEntbindungTypeImpl
