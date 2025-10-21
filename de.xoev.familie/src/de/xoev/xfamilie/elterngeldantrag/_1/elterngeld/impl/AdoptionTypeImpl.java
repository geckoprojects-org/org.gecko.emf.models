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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType;
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
 * An implementation of the model object '<em><b>Adoption Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AdoptionTypeImpl#isAdoption <em>Adoption</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AdoptionTypeImpl#getAdoptionHaushaltsaufnahme <em>Adoption Haushaltsaufnahme</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AdoptionTypeImpl#getNachweisAdoption <em>Nachweis Adoption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdoptionTypeImpl extends MinimalEObjectImpl.Container implements AdoptionType {
	/**
	 * The default value of the '{@link #isAdoption() <em>Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdoption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADOPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdoption() <em>Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdoption()
	 * @generated
	 * @ordered
	 */
	protected boolean adoption = ADOPTION_EDEFAULT;

	/**
	 * This is true if the Adoption attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean adoptionESet;

	/**
	 * The default value of the '{@link #getAdoptionHaushaltsaufnahme() <em>Adoption Haushaltsaufnahme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdoptionHaushaltsaufnahme()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ADOPTION_HAUSHALTSAUFNAHME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdoptionHaushaltsaufnahme() <em>Adoption Haushaltsaufnahme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdoptionHaushaltsaufnahme()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar adoptionHaushaltsaufnahme = ADOPTION_HAUSHALTSAUFNAHME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNachweisAdoption() <em>Nachweis Adoption</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisAdoption()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisAdoption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdoptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getAdoptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAdoption() {
		return adoption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdoption(boolean newAdoption) {
		boolean oldAdoption = adoption;
		adoption = newAdoption;
		boolean oldAdoptionESet = adoptionESet;
		adoptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ADOPTION_TYPE__ADOPTION, oldAdoption, adoption, !oldAdoptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAdoption() {
		boolean oldAdoption = adoption;
		boolean oldAdoptionESet = adoptionESet;
		adoption = ADOPTION_EDEFAULT;
		adoptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ADOPTION_TYPE__ADOPTION, oldAdoption, ADOPTION_EDEFAULT, oldAdoptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAdoption() {
		return adoptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getAdoptionHaushaltsaufnahme() {
		return adoptionHaushaltsaufnahme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdoptionHaushaltsaufnahme(XMLGregorianCalendar newAdoptionHaushaltsaufnahme) {
		XMLGregorianCalendar oldAdoptionHaushaltsaufnahme = adoptionHaushaltsaufnahme;
		adoptionHaushaltsaufnahme = newAdoptionHaushaltsaufnahme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ADOPTION_TYPE__ADOPTION_HAUSHALTSAUFNAHME, oldAdoptionHaushaltsaufnahme, adoptionHaushaltsaufnahme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisAdoption() {
		if (nachweisAdoption == null) {
			nachweisAdoption = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.ADOPTION_TYPE__NACHWEIS_ADOPTION);
		}
		return nachweisAdoption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.ADOPTION_TYPE__NACHWEIS_ADOPTION:
				return ((InternalEList<?>)getNachweisAdoption()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.ADOPTION_TYPE__ADOPTION:
				return isAdoption();
			case ElterngeldPackage.ADOPTION_TYPE__ADOPTION_HAUSHALTSAUFNAHME:
				return getAdoptionHaushaltsaufnahme();
			case ElterngeldPackage.ADOPTION_TYPE__NACHWEIS_ADOPTION:
				return getNachweisAdoption();
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
			case ElterngeldPackage.ADOPTION_TYPE__ADOPTION:
				setAdoption((Boolean)newValue);
				return;
			case ElterngeldPackage.ADOPTION_TYPE__ADOPTION_HAUSHALTSAUFNAHME:
				setAdoptionHaushaltsaufnahme((XMLGregorianCalendar)newValue);
				return;
			case ElterngeldPackage.ADOPTION_TYPE__NACHWEIS_ADOPTION:
				getNachweisAdoption().clear();
				getNachweisAdoption().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.ADOPTION_TYPE__ADOPTION:
				unsetAdoption();
				return;
			case ElterngeldPackage.ADOPTION_TYPE__ADOPTION_HAUSHALTSAUFNAHME:
				setAdoptionHaushaltsaufnahme(ADOPTION_HAUSHALTSAUFNAHME_EDEFAULT);
				return;
			case ElterngeldPackage.ADOPTION_TYPE__NACHWEIS_ADOPTION:
				getNachweisAdoption().clear();
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
			case ElterngeldPackage.ADOPTION_TYPE__ADOPTION:
				return isSetAdoption();
			case ElterngeldPackage.ADOPTION_TYPE__ADOPTION_HAUSHALTSAUFNAHME:
				return ADOPTION_HAUSHALTSAUFNAHME_EDEFAULT == null ? adoptionHaushaltsaufnahme != null : !ADOPTION_HAUSHALTSAUFNAHME_EDEFAULT.equals(adoptionHaushaltsaufnahme);
			case ElterngeldPackage.ADOPTION_TYPE__NACHWEIS_ADOPTION:
				return nachweisAdoption != null && !nachweisAdoption.isEmpty();
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
		result.append(" (adoption: ");
		if (adoptionESet) result.append(adoption); else result.append("<unset>");
		result.append(", adoptionHaushaltsaufnahme: ");
		result.append(adoptionHaushaltsaufnahme);
		result.append(')');
		return result.toString();
	}

} //AdoptionTypeImpl
