/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.FeldType;
import de.xoev.domea.domea.FeldgruppeType;

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
 * An implementation of the model object '<em><b>Feldgruppe Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.FeldgruppeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.FeldgruppeTypeImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.FeldgruppeTypeImpl#getUnterfeldgruppe <em>Unterfeldgruppe</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.FeldgruppeTypeImpl#getFeld <em>Feld</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeldgruppeTypeImpl extends MinimalEObjectImpl.Container implements FeldgruppeType {
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
	 * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected static final String BESCHREIBUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected String beschreibung = BESCHREIBUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnterfeldgruppe() <em>Unterfeldgruppe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterfeldgruppe()
	 * @generated
	 * @ordered
	 */
	protected EList<FeldgruppeType> unterfeldgruppe;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeldgruppeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.FELDGRUPPE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.FELDGRUPPE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeschreibung() {
		return beschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeschreibung(String newBeschreibung) {
		String oldBeschreibung = beschreibung;
		beschreibung = newBeschreibung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.FELDGRUPPE_TYPE__BESCHREIBUNG, oldBeschreibung, beschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeldgruppeType> getUnterfeldgruppe() {
		if (unterfeldgruppe == null) {
			unterfeldgruppe = new EObjectContainmentEList<FeldgruppeType>(FeldgruppeType.class, this, DomeaPackage.FELDGRUPPE_TYPE__UNTERFELDGRUPPE);
		}
		return unterfeldgruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeldType> getFeld() {
		if (feld == null) {
			feld = new EObjectContainmentEList<FeldType>(FeldType.class, this, DomeaPackage.FELDGRUPPE_TYPE__FELD);
		}
		return feld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.FELDGRUPPE_TYPE__UNTERFELDGRUPPE:
				return ((InternalEList<?>)getUnterfeldgruppe()).basicRemove(otherEnd, msgs);
			case DomeaPackage.FELDGRUPPE_TYPE__FELD:
				return ((InternalEList<?>)getFeld()).basicRemove(otherEnd, msgs);
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
			case DomeaPackage.FELDGRUPPE_TYPE__NAME:
				return getName();
			case DomeaPackage.FELDGRUPPE_TYPE__BESCHREIBUNG:
				return getBeschreibung();
			case DomeaPackage.FELDGRUPPE_TYPE__UNTERFELDGRUPPE:
				return getUnterfeldgruppe();
			case DomeaPackage.FELDGRUPPE_TYPE__FELD:
				return getFeld();
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
			case DomeaPackage.FELDGRUPPE_TYPE__NAME:
				setName((String)newValue);
				return;
			case DomeaPackage.FELDGRUPPE_TYPE__BESCHREIBUNG:
				setBeschreibung((String)newValue);
				return;
			case DomeaPackage.FELDGRUPPE_TYPE__UNTERFELDGRUPPE:
				getUnterfeldgruppe().clear();
				getUnterfeldgruppe().addAll((Collection<? extends FeldgruppeType>)newValue);
				return;
			case DomeaPackage.FELDGRUPPE_TYPE__FELD:
				getFeld().clear();
				getFeld().addAll((Collection<? extends FeldType>)newValue);
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
			case DomeaPackage.FELDGRUPPE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomeaPackage.FELDGRUPPE_TYPE__BESCHREIBUNG:
				setBeschreibung(BESCHREIBUNG_EDEFAULT);
				return;
			case DomeaPackage.FELDGRUPPE_TYPE__UNTERFELDGRUPPE:
				getUnterfeldgruppe().clear();
				return;
			case DomeaPackage.FELDGRUPPE_TYPE__FELD:
				getFeld().clear();
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
			case DomeaPackage.FELDGRUPPE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomeaPackage.FELDGRUPPE_TYPE__BESCHREIBUNG:
				return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
			case DomeaPackage.FELDGRUPPE_TYPE__UNTERFELDGRUPPE:
				return unterfeldgruppe != null && !unterfeldgruppe.isEmpty();
			case DomeaPackage.FELDGRUPPE_TYPE__FELD:
				return feld != null && !feld.isEmpty();
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
		result.append(", beschreibung: ");
		result.append(beschreibung);
		result.append(')');
		return result.toString();
	}

} //FeldgruppeTypeImpl
