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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType;
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
 * An implementation of the model object '<em><b>Besonders Frueh Geborenes Kind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BesondersFruehGeborenesKindTypeImpl#isBesondersFruehGeborenesKind <em>Besonders Frueh Geborenes Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BesondersFruehGeborenesKindTypeImpl#getErrechneterGeburtstermin <em>Errechneter Geburtstermin</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BesondersFruehGeborenesKindTypeImpl#getNachweisBesondersFruehGeboren <em>Nachweis Besonders Frueh Geboren</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BesondersFruehGeborenesKindTypeImpl extends MinimalEObjectImpl.Container implements BesondersFruehGeborenesKindType {
	/**
	 * The default value of the '{@link #isBesondersFruehGeborenesKind() <em>Besonders Frueh Geborenes Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBesondersFruehGeborenesKind()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BESONDERS_FRUEH_GEBORENES_KIND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBesondersFruehGeborenesKind() <em>Besonders Frueh Geborenes Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBesondersFruehGeborenesKind()
	 * @generated
	 * @ordered
	 */
	protected boolean besondersFruehGeborenesKind = BESONDERS_FRUEH_GEBORENES_KIND_EDEFAULT;

	/**
	 * This is true if the Besonders Frueh Geborenes Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean besondersFruehGeborenesKindESet;

	/**
	 * The default value of the '{@link #getErrechneterGeburtstermin() <em>Errechneter Geburtstermin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrechneterGeburtstermin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ERRECHNETER_GEBURTSTERMIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrechneterGeburtstermin() <em>Errechneter Geburtstermin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrechneterGeburtstermin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar errechneterGeburtstermin = ERRECHNETER_GEBURTSTERMIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNachweisBesondersFruehGeboren() <em>Nachweis Besonders Frueh Geboren</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisBesondersFruehGeboren()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisBesondersFruehGeboren;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BesondersFruehGeborenesKindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getBesondersFruehGeborenesKindType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBesondersFruehGeborenesKind() {
		return besondersFruehGeborenesKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBesondersFruehGeborenesKind(boolean newBesondersFruehGeborenesKind) {
		boolean oldBesondersFruehGeborenesKind = besondersFruehGeborenesKind;
		besondersFruehGeborenesKind = newBesondersFruehGeborenesKind;
		boolean oldBesondersFruehGeborenesKindESet = besondersFruehGeborenesKindESet;
		besondersFruehGeborenesKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__BESONDERS_FRUEH_GEBORENES_KIND, oldBesondersFruehGeborenesKind, besondersFruehGeborenesKind, !oldBesondersFruehGeborenesKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBesondersFruehGeborenesKind() {
		boolean oldBesondersFruehGeborenesKind = besondersFruehGeborenesKind;
		boolean oldBesondersFruehGeborenesKindESet = besondersFruehGeborenesKindESet;
		besondersFruehGeborenesKind = BESONDERS_FRUEH_GEBORENES_KIND_EDEFAULT;
		besondersFruehGeborenesKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__BESONDERS_FRUEH_GEBORENES_KIND, oldBesondersFruehGeborenesKind, BESONDERS_FRUEH_GEBORENES_KIND_EDEFAULT, oldBesondersFruehGeborenesKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBesondersFruehGeborenesKind() {
		return besondersFruehGeborenesKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getErrechneterGeburtstermin() {
		return errechneterGeburtstermin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrechneterGeburtstermin(XMLGregorianCalendar newErrechneterGeburtstermin) {
		XMLGregorianCalendar oldErrechneterGeburtstermin = errechneterGeburtstermin;
		errechneterGeburtstermin = newErrechneterGeburtstermin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__ERRECHNETER_GEBURTSTERMIN, oldErrechneterGeburtstermin, errechneterGeburtstermin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisBesondersFruehGeboren() {
		if (nachweisBesondersFruehGeboren == null) {
			nachweisBesondersFruehGeboren = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__NACHWEIS_BESONDERS_FRUEH_GEBOREN);
		}
		return nachweisBesondersFruehGeboren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__NACHWEIS_BESONDERS_FRUEH_GEBOREN:
				return ((InternalEList<?>)getNachweisBesondersFruehGeboren()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__BESONDERS_FRUEH_GEBORENES_KIND:
				return isBesondersFruehGeborenesKind();
			case ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__ERRECHNETER_GEBURTSTERMIN:
				return getErrechneterGeburtstermin();
			case ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__NACHWEIS_BESONDERS_FRUEH_GEBOREN:
				return getNachweisBesondersFruehGeboren();
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
			case ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__BESONDERS_FRUEH_GEBORENES_KIND:
				setBesondersFruehGeborenesKind((Boolean)newValue);
				return;
			case ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__ERRECHNETER_GEBURTSTERMIN:
				setErrechneterGeburtstermin((XMLGregorianCalendar)newValue);
				return;
			case ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__NACHWEIS_BESONDERS_FRUEH_GEBOREN:
				getNachweisBesondersFruehGeboren().clear();
				getNachweisBesondersFruehGeboren().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__BESONDERS_FRUEH_GEBORENES_KIND:
				unsetBesondersFruehGeborenesKind();
				return;
			case ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__ERRECHNETER_GEBURTSTERMIN:
				setErrechneterGeburtstermin(ERRECHNETER_GEBURTSTERMIN_EDEFAULT);
				return;
			case ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__NACHWEIS_BESONDERS_FRUEH_GEBOREN:
				getNachweisBesondersFruehGeboren().clear();
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
			case ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__BESONDERS_FRUEH_GEBORENES_KIND:
				return isSetBesondersFruehGeborenesKind();
			case ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__ERRECHNETER_GEBURTSTERMIN:
				return ERRECHNETER_GEBURTSTERMIN_EDEFAULT == null ? errechneterGeburtstermin != null : !ERRECHNETER_GEBURTSTERMIN_EDEFAULT.equals(errechneterGeburtstermin);
			case ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE__NACHWEIS_BESONDERS_FRUEH_GEBOREN:
				return nachweisBesondersFruehGeboren != null && !nachweisBesondersFruehGeboren.isEmpty();
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
		result.append(" (besondersFruehGeborenesKind: ");
		if (besondersFruehGeborenesKindESet) result.append(besondersFruehGeborenesKind); else result.append("<unset>");
		result.append(", errechneterGeburtstermin: ");
		result.append(errechneterGeburtstermin);
		result.append(')');
		return result.toString();
	}

} //BesondersFruehGeborenesKindTypeImpl
