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
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType;
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
 * An implementation of the model object '<em><b>EG Aelteres Kind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EGAelteresKindTypeImpl#isBezugEGAelteresKind <em>Bezug EG Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EGAelteresKindTypeImpl#getZeitraumEGAelteresKind <em>Zeitraum EG Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EGAelteresKindTypeImpl#getNachweisEGAelteresKind <em>Nachweis EG Aelteres Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EGAelteresKindTypeImpl extends MinimalEObjectImpl.Container implements EGAelteresKindType {
	/**
	 * The default value of the '{@link #isBezugEGAelteresKind() <em>Bezug EG Aelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugEGAelteresKind()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEZUG_EG_AELTERES_KIND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBezugEGAelteresKind() <em>Bezug EG Aelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugEGAelteresKind()
	 * @generated
	 * @ordered
	 */
	protected boolean bezugEGAelteresKind = BEZUG_EG_AELTERES_KIND_EDEFAULT;

	/**
	 * This is true if the Bezug EG Aelteres Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bezugEGAelteresKindESet;

	/**
	 * The cached value of the '{@link #getZeitraumEGAelteresKind() <em>Zeitraum EG Aelteres Kind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumEGAelteresKind()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> zeitraumEGAelteresKind;

	/**
	 * The cached value of the '{@link #getNachweisEGAelteresKind() <em>Nachweis EG Aelteres Kind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisEGAelteresKind()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisEGAelteresKind;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EGAelteresKindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getEGAelteresKindType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBezugEGAelteresKind() {
		return bezugEGAelteresKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezugEGAelteresKind(boolean newBezugEGAelteresKind) {
		boolean oldBezugEGAelteresKind = bezugEGAelteresKind;
		bezugEGAelteresKind = newBezugEGAelteresKind;
		boolean oldBezugEGAelteresKindESet = bezugEGAelteresKindESet;
		bezugEGAelteresKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EG_AELTERES_KIND_TYPE__BEZUG_EG_AELTERES_KIND, oldBezugEGAelteresKind, bezugEGAelteresKind, !oldBezugEGAelteresKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBezugEGAelteresKind() {
		boolean oldBezugEGAelteresKind = bezugEGAelteresKind;
		boolean oldBezugEGAelteresKindESet = bezugEGAelteresKindESet;
		bezugEGAelteresKind = BEZUG_EG_AELTERES_KIND_EDEFAULT;
		bezugEGAelteresKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EG_AELTERES_KIND_TYPE__BEZUG_EG_AELTERES_KIND, oldBezugEGAelteresKind, BEZUG_EG_AELTERES_KIND_EDEFAULT, oldBezugEGAelteresKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBezugEGAelteresKind() {
		return bezugEGAelteresKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getZeitraumEGAelteresKind() {
		if (zeitraumEGAelteresKind == null) {
			zeitraumEGAelteresKind = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, ElterngeldPackage.EG_AELTERES_KIND_TYPE__ZEITRAUM_EG_AELTERES_KIND);
		}
		return zeitraumEGAelteresKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisEGAelteresKind() {
		if (nachweisEGAelteresKind == null) {
			nachweisEGAelteresKind = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.EG_AELTERES_KIND_TYPE__NACHWEIS_EG_AELTERES_KIND);
		}
		return nachweisEGAelteresKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE__ZEITRAUM_EG_AELTERES_KIND:
				return ((InternalEList<?>)getZeitraumEGAelteresKind()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE__NACHWEIS_EG_AELTERES_KIND:
				return ((InternalEList<?>)getNachweisEGAelteresKind()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE__BEZUG_EG_AELTERES_KIND:
				return isBezugEGAelteresKind();
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE__ZEITRAUM_EG_AELTERES_KIND:
				return getZeitraumEGAelteresKind();
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE__NACHWEIS_EG_AELTERES_KIND:
				return getNachweisEGAelteresKind();
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
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE__BEZUG_EG_AELTERES_KIND:
				setBezugEGAelteresKind((Boolean)newValue);
				return;
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE__ZEITRAUM_EG_AELTERES_KIND:
				getZeitraumEGAelteresKind().clear();
				getZeitraumEGAelteresKind().addAll((Collection<? extends ZeitraumType>)newValue);
				return;
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE__NACHWEIS_EG_AELTERES_KIND:
				getNachweisEGAelteresKind().clear();
				getNachweisEGAelteresKind().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE__BEZUG_EG_AELTERES_KIND:
				unsetBezugEGAelteresKind();
				return;
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE__ZEITRAUM_EG_AELTERES_KIND:
				getZeitraumEGAelteresKind().clear();
				return;
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE__NACHWEIS_EG_AELTERES_KIND:
				getNachweisEGAelteresKind().clear();
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
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE__BEZUG_EG_AELTERES_KIND:
				return isSetBezugEGAelteresKind();
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE__ZEITRAUM_EG_AELTERES_KIND:
				return zeitraumEGAelteresKind != null && !zeitraumEGAelteresKind.isEmpty();
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE__NACHWEIS_EG_AELTERES_KIND:
				return nachweisEGAelteresKind != null && !nachweisEGAelteresKind.isEmpty();
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
		result.append(" (bezugEGAelteresKind: ");
		if (bezugEGAelteresKindESet) result.append(bezugEGAelteresKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EGAelteresKindTypeImpl
