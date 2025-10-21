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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BehinderungKindType;
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
 * An implementation of the model object '<em><b>Behinderung Kind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BehinderungKindTypeImpl#isBehinderungKind <em>Behinderung Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BehinderungKindTypeImpl#getNachweisBehinderungKind <em>Nachweis Behinderung Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehinderungKindTypeImpl extends MinimalEObjectImpl.Container implements BehinderungKindType {
	/**
	 * The default value of the '{@link #isBehinderungKind() <em>Behinderung Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBehinderungKind()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEHINDERUNG_KIND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBehinderungKind() <em>Behinderung Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBehinderungKind()
	 * @generated
	 * @ordered
	 */
	protected boolean behinderungKind = BEHINDERUNG_KIND_EDEFAULT;

	/**
	 * This is true if the Behinderung Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean behinderungKindESet;

	/**
	 * The cached value of the '{@link #getNachweisBehinderungKind() <em>Nachweis Behinderung Kind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisBehinderungKind()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisBehinderungKind;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehinderungKindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getBehinderungKindType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBehinderungKind() {
		return behinderungKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBehinderungKind(boolean newBehinderungKind) {
		boolean oldBehinderungKind = behinderungKind;
		behinderungKind = newBehinderungKind;
		boolean oldBehinderungKindESet = behinderungKindESet;
		behinderungKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BEHINDERUNG_KIND_TYPE__BEHINDERUNG_KIND, oldBehinderungKind, behinderungKind, !oldBehinderungKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBehinderungKind() {
		boolean oldBehinderungKind = behinderungKind;
		boolean oldBehinderungKindESet = behinderungKindESet;
		behinderungKind = BEHINDERUNG_KIND_EDEFAULT;
		behinderungKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.BEHINDERUNG_KIND_TYPE__BEHINDERUNG_KIND, oldBehinderungKind, BEHINDERUNG_KIND_EDEFAULT, oldBehinderungKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBehinderungKind() {
		return behinderungKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisBehinderungKind() {
		if (nachweisBehinderungKind == null) {
			nachweisBehinderungKind = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.BEHINDERUNG_KIND_TYPE__NACHWEIS_BEHINDERUNG_KIND);
		}
		return nachweisBehinderungKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.BEHINDERUNG_KIND_TYPE__NACHWEIS_BEHINDERUNG_KIND:
				return ((InternalEList<?>)getNachweisBehinderungKind()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.BEHINDERUNG_KIND_TYPE__BEHINDERUNG_KIND:
				return isBehinderungKind();
			case ElterngeldPackage.BEHINDERUNG_KIND_TYPE__NACHWEIS_BEHINDERUNG_KIND:
				return getNachweisBehinderungKind();
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
			case ElterngeldPackage.BEHINDERUNG_KIND_TYPE__BEHINDERUNG_KIND:
				setBehinderungKind((Boolean)newValue);
				return;
			case ElterngeldPackage.BEHINDERUNG_KIND_TYPE__NACHWEIS_BEHINDERUNG_KIND:
				getNachweisBehinderungKind().clear();
				getNachweisBehinderungKind().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.BEHINDERUNG_KIND_TYPE__BEHINDERUNG_KIND:
				unsetBehinderungKind();
				return;
			case ElterngeldPackage.BEHINDERUNG_KIND_TYPE__NACHWEIS_BEHINDERUNG_KIND:
				getNachweisBehinderungKind().clear();
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
			case ElterngeldPackage.BEHINDERUNG_KIND_TYPE__BEHINDERUNG_KIND:
				return isSetBehinderungKind();
			case ElterngeldPackage.BEHINDERUNG_KIND_TYPE__NACHWEIS_BEHINDERUNG_KIND:
				return nachweisBehinderungKind != null && !nachweisBehinderungKind.isEmpty();
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
		result.append(" (behinderungKind: ");
		if (behinderungKindESet) result.append(behinderungKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BehinderungKindTypeImpl
