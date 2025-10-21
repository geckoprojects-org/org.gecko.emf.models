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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeBasisType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verwitwet Antragstellende Basis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerwitwetAntragstellendeBasisTypeImpl#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerwitwetAntragstellendeBasisTypeImpl#getSeitWann <em>Seit Wann</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerwitwetAntragstellendeBasisTypeImpl#isHochzeitGeplant <em>Hochzeit Geplant</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerwitwetAntragstellendeBasisTypeImpl#getHochzeitsdatumVoraussichtlich <em>Hochzeitsdatum Voraussichtlich</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerwitwetAntragstellendeBasisTypeImpl extends MinimalEObjectImpl.Container implements VerwitwetAntragstellendeBasisType {
	/**
	 * The cached value of the '{@link #getNachweis() <em>Nachweis</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<String> nachweis;

	/**
	 * The cached value of the '{@link #getSeitWann() <em>Seit Wann</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeitWann()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType seitWann;

	/**
	 * The default value of the '{@link #isHochzeitGeplant() <em>Hochzeit Geplant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHochzeitGeplant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HOCHZEIT_GEPLANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHochzeitGeplant() <em>Hochzeit Geplant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHochzeitGeplant()
	 * @generated
	 * @ordered
	 */
	protected boolean hochzeitGeplant = HOCHZEIT_GEPLANT_EDEFAULT;

	/**
	 * This is true if the Hochzeit Geplant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hochzeitGeplantESet;

	/**
	 * The default value of the '{@link #getHochzeitsdatumVoraussichtlich() <em>Hochzeitsdatum Voraussichtlich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHochzeitsdatumVoraussichtlich()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HOCHZEITSDATUM_VORAUSSICHTLICH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHochzeitsdatumVoraussichtlich() <em>Hochzeitsdatum Voraussichtlich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHochzeitsdatumVoraussichtlich()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar hochzeitsdatumVoraussichtlich = HOCHZEITSDATUM_VORAUSSICHTLICH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerwitwetAntragstellendeBasisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getVerwitwetAntragstellendeBasisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNachweis() {
		if (nachweis == null) {
			nachweis = new EDataTypeEList<String>(String.class, this, UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS);
		}
		return nachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getSeitWann() {
		return seitWann;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeitWann(TeilbekanntesDatumType newSeitWann, NotificationChain msgs) {
		TeilbekanntesDatumType oldSeitWann = seitWann;
		seitWann = newSeitWann;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN, oldSeitWann, newSeitWann);
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
	public void setSeitWann(TeilbekanntesDatumType newSeitWann) {
		if (newSeitWann != seitWann) {
			NotificationChain msgs = null;
			if (seitWann != null)
				msgs = ((InternalEObject)seitWann).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN, null, msgs);
			if (newSeitWann != null)
				msgs = ((InternalEObject)newSeitWann).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN, null, msgs);
			msgs = basicSetSeitWann(newSeitWann, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN, newSeitWann, newSeitWann));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHochzeitGeplant() {
		return hochzeitGeplant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHochzeitGeplant(boolean newHochzeitGeplant) {
		boolean oldHochzeitGeplant = hochzeitGeplant;
		hochzeitGeplant = newHochzeitGeplant;
		boolean oldHochzeitGeplantESet = hochzeitGeplantESet;
		hochzeitGeplantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT, oldHochzeitGeplant, hochzeitGeplant, !oldHochzeitGeplantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHochzeitGeplant() {
		boolean oldHochzeitGeplant = hochzeitGeplant;
		boolean oldHochzeitGeplantESet = hochzeitGeplantESet;
		hochzeitGeplant = HOCHZEIT_GEPLANT_EDEFAULT;
		hochzeitGeplantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT, oldHochzeitGeplant, HOCHZEIT_GEPLANT_EDEFAULT, oldHochzeitGeplantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHochzeitGeplant() {
		return hochzeitGeplantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getHochzeitsdatumVoraussichtlich() {
		return hochzeitsdatumVoraussichtlich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHochzeitsdatumVoraussichtlich(XMLGregorianCalendar newHochzeitsdatumVoraussichtlich) {
		XMLGregorianCalendar oldHochzeitsdatumVoraussichtlich = hochzeitsdatumVoraussichtlich;
		hochzeitsdatumVoraussichtlich = newHochzeitsdatumVoraussichtlich;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH, oldHochzeitsdatumVoraussichtlich, hochzeitsdatumVoraussichtlich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN:
				return basicSetSeitWann(null, msgs);
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
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS:
				return getNachweis();
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN:
				return getSeitWann();
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT:
				return isHochzeitGeplant();
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH:
				return getHochzeitsdatumVoraussichtlich();
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
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS:
				getNachweis().clear();
				getNachweis().addAll((Collection<? extends String>)newValue);
				return;
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN:
				setSeitWann((TeilbekanntesDatumType)newValue);
				return;
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT:
				setHochzeitGeplant((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH:
				setHochzeitsdatumVoraussichtlich((XMLGregorianCalendar)newValue);
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
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS:
				getNachweis().clear();
				return;
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN:
				setSeitWann((TeilbekanntesDatumType)null);
				return;
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT:
				unsetHochzeitGeplant();
				return;
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH:
				setHochzeitsdatumVoraussichtlich(HOCHZEITSDATUM_VORAUSSICHTLICH_EDEFAULT);
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
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__NACHWEIS:
				return nachweis != null && !nachweis.isEmpty();
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN:
				return seitWann != null;
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT:
				return isSetHochzeitGeplant();
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH:
				return HOCHZEITSDATUM_VORAUSSICHTLICH_EDEFAULT == null ? hochzeitsdatumVoraussichtlich != null : !HOCHZEITSDATUM_VORAUSSICHTLICH_EDEFAULT.equals(hochzeitsdatumVoraussichtlich);
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
		result.append(" (nachweis: ");
		result.append(nachweis);
		result.append(", hochzeitGeplant: ");
		if (hochzeitGeplantESet) result.append(hochzeitGeplant); else result.append("<unset>");
		result.append(", hochzeitsdatumVoraussichtlich: ");
		result.append(hochzeitsdatumVoraussichtlich);
		result.append(')');
		return result.toString();
	}

} //VerwitwetAntragstellendeBasisTypeImpl
