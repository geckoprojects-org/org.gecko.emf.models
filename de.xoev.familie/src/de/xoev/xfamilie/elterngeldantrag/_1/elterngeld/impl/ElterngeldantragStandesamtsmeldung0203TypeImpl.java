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

import de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragStandesamtsmeldung0203Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elterngeldantrag Standesamtsmeldung0203 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragStandesamtsmeldung0203TypeImpl#isAnforderungErfolgt <em>Anforderung Erfolgt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElterngeldantragStandesamtsmeldung0203TypeImpl extends AntragsnachrichtTypeImpl implements ElterngeldantragStandesamtsmeldung0203Type {
	/**
	 * The default value of the '{@link #isAnforderungErfolgt() <em>Anforderung Erfolgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnforderungErfolgt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANFORDERUNG_ERFOLGT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnforderungErfolgt() <em>Anforderung Erfolgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnforderungErfolgt()
	 * @generated
	 * @ordered
	 */
	protected boolean anforderungErfolgt = ANFORDERUNG_ERFOLGT_EDEFAULT;

	/**
	 * This is true if the Anforderung Erfolgt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anforderungErfolgtESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElterngeldantragStandesamtsmeldung0203TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getElterngeldantragStandesamtsmeldung0203Type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAnforderungErfolgt() {
		return anforderungErfolgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnforderungErfolgt(boolean newAnforderungErfolgt) {
		boolean oldAnforderungErfolgt = anforderungErfolgt;
		anforderungErfolgt = newAnforderungErfolgt;
		boolean oldAnforderungErfolgtESet = anforderungErfolgtESet;
		anforderungErfolgtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__ANFORDERUNG_ERFOLGT, oldAnforderungErfolgt, anforderungErfolgt, !oldAnforderungErfolgtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAnforderungErfolgt() {
		boolean oldAnforderungErfolgt = anforderungErfolgt;
		boolean oldAnforderungErfolgtESet = anforderungErfolgtESet;
		anforderungErfolgt = ANFORDERUNG_ERFOLGT_EDEFAULT;
		anforderungErfolgtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__ANFORDERUNG_ERFOLGT, oldAnforderungErfolgt, ANFORDERUNG_ERFOLGT_EDEFAULT, oldAnforderungErfolgtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAnforderungErfolgt() {
		return anforderungErfolgtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElterngeldPackage.ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__ANFORDERUNG_ERFOLGT:
				return isAnforderungErfolgt();
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
			case ElterngeldPackage.ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__ANFORDERUNG_ERFOLGT:
				setAnforderungErfolgt((Boolean)newValue);
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
			case ElterngeldPackage.ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__ANFORDERUNG_ERFOLGT:
				unsetAnforderungErfolgt();
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
			case ElterngeldPackage.ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE__ANFORDERUNG_ERFOLGT:
				return isSetAnforderungErfolgt();
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
		result.append(" (anforderungErfolgt: ");
		if (anforderungErfolgtESet) result.append(anforderungErfolgt); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ElterngeldantragStandesamtsmeldung0203TypeImpl
