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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType;

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
 * An implementation of the model object '<em><b>Krankentagegeld Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankentagegeldTypeImpl#isBezugKrankentagegeld <em>Bezug Krankentagegeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankentagegeldTypeImpl#getZeitraumKrankentagegeld <em>Zeitraum Krankentagegeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankentagegeldTypeImpl#getNachweisKrankentagegeld <em>Nachweis Krankentagegeld</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KrankentagegeldTypeImpl extends MinimalEObjectImpl.Container implements KrankentagegeldType {
	/**
	 * The default value of the '{@link #isBezugKrankentagegeld() <em>Bezug Krankentagegeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugKrankentagegeld()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEZUG_KRANKENTAGEGELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBezugKrankentagegeld() <em>Bezug Krankentagegeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugKrankentagegeld()
	 * @generated
	 * @ordered
	 */
	protected boolean bezugKrankentagegeld = BEZUG_KRANKENTAGEGELD_EDEFAULT;

	/**
	 * This is true if the Bezug Krankentagegeld attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bezugKrankentagegeldESet;

	/**
	 * The cached value of the '{@link #getZeitraumKrankentagegeld() <em>Zeitraum Krankentagegeld</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumKrankentagegeld()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> zeitraumKrankentagegeld;

	/**
	 * The cached value of the '{@link #getNachweisKrankentagegeld() <em>Nachweis Krankentagegeld</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisKrankentagegeld()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisKrankentagegeld;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KrankentagegeldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getKrankentagegeldType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBezugKrankentagegeld() {
		return bezugKrankentagegeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezugKrankentagegeld(boolean newBezugKrankentagegeld) {
		boolean oldBezugKrankentagegeld = bezugKrankentagegeld;
		bezugKrankentagegeld = newBezugKrankentagegeld;
		boolean oldBezugKrankentagegeldESet = bezugKrankentagegeldESet;
		bezugKrankentagegeldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KRANKENTAGEGELD_TYPE__BEZUG_KRANKENTAGEGELD, oldBezugKrankentagegeld, bezugKrankentagegeld, !oldBezugKrankentagegeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBezugKrankentagegeld() {
		boolean oldBezugKrankentagegeld = bezugKrankentagegeld;
		boolean oldBezugKrankentagegeldESet = bezugKrankentagegeldESet;
		bezugKrankentagegeld = BEZUG_KRANKENTAGEGELD_EDEFAULT;
		bezugKrankentagegeldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.KRANKENTAGEGELD_TYPE__BEZUG_KRANKENTAGEGELD, oldBezugKrankentagegeld, BEZUG_KRANKENTAGEGELD_EDEFAULT, oldBezugKrankentagegeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBezugKrankentagegeld() {
		return bezugKrankentagegeldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getZeitraumKrankentagegeld() {
		if (zeitraumKrankentagegeld == null) {
			zeitraumKrankentagegeld = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, ElterngeldPackage.KRANKENTAGEGELD_TYPE__ZEITRAUM_KRANKENTAGEGELD);
		}
		return zeitraumKrankentagegeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisKrankentagegeld() {
		if (nachweisKrankentagegeld == null) {
			nachweisKrankentagegeld = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.KRANKENTAGEGELD_TYPE__NACHWEIS_KRANKENTAGEGELD);
		}
		return nachweisKrankentagegeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE__ZEITRAUM_KRANKENTAGEGELD:
				return ((InternalEList<?>)getZeitraumKrankentagegeld()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE__NACHWEIS_KRANKENTAGEGELD:
				return ((InternalEList<?>)getNachweisKrankentagegeld()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE__BEZUG_KRANKENTAGEGELD:
				return isBezugKrankentagegeld();
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE__ZEITRAUM_KRANKENTAGEGELD:
				return getZeitraumKrankentagegeld();
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE__NACHWEIS_KRANKENTAGEGELD:
				return getNachweisKrankentagegeld();
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
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE__BEZUG_KRANKENTAGEGELD:
				setBezugKrankentagegeld((Boolean)newValue);
				return;
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE__ZEITRAUM_KRANKENTAGEGELD:
				getZeitraumKrankentagegeld().clear();
				getZeitraumKrankentagegeld().addAll((Collection<? extends ZeitraumType>)newValue);
				return;
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE__NACHWEIS_KRANKENTAGEGELD:
				getNachweisKrankentagegeld().clear();
				getNachweisKrankentagegeld().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE__BEZUG_KRANKENTAGEGELD:
				unsetBezugKrankentagegeld();
				return;
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE__ZEITRAUM_KRANKENTAGEGELD:
				getZeitraumKrankentagegeld().clear();
				return;
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE__NACHWEIS_KRANKENTAGEGELD:
				getNachweisKrankentagegeld().clear();
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
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE__BEZUG_KRANKENTAGEGELD:
				return isSetBezugKrankentagegeld();
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE__ZEITRAUM_KRANKENTAGEGELD:
				return zeitraumKrankentagegeld != null && !zeitraumKrankentagegeld.isEmpty();
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE__NACHWEIS_KRANKENTAGEGELD:
				return nachweisKrankentagegeld != null && !nachweisKrankentagegeld.isEmpty();
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
		result.append(" (bezugKrankentagegeld: ");
		if (bezugKrankentagegeldESet) result.append(bezugKrankentagegeld); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //KrankentagegeldTypeImpl
