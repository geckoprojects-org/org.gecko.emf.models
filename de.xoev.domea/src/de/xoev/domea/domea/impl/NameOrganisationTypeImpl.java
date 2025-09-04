/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.NameOrganisationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Organisation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.NameOrganisationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NameOrganisationTypeImpl#getKurzbezeichnung <em>Kurzbezeichnung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameOrganisationTypeImpl extends MinimalEObjectImpl.Container implements NameOrganisationType {
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
	 * The default value of the '{@link #getKurzbezeichnung() <em>Kurzbezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKurzbezeichnung()
	 * @generated
	 * @ordered
	 */
	protected static final String KURZBEZEICHNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKurzbezeichnung() <em>Kurzbezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKurzbezeichnung()
	 * @generated
	 * @ordered
	 */
	protected String kurzbezeichnung = KURZBEZEICHNUNG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameOrganisationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.NAME_ORGANISATION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NAME_ORGANISATION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKurzbezeichnung() {
		return kurzbezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKurzbezeichnung(String newKurzbezeichnung) {
		String oldKurzbezeichnung = kurzbezeichnung;
		kurzbezeichnung = newKurzbezeichnung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NAME_ORGANISATION_TYPE__KURZBEZEICHNUNG, oldKurzbezeichnung, kurzbezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomeaPackage.NAME_ORGANISATION_TYPE__NAME:
				return getName();
			case DomeaPackage.NAME_ORGANISATION_TYPE__KURZBEZEICHNUNG:
				return getKurzbezeichnung();
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
			case DomeaPackage.NAME_ORGANISATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case DomeaPackage.NAME_ORGANISATION_TYPE__KURZBEZEICHNUNG:
				setKurzbezeichnung((String)newValue);
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
			case DomeaPackage.NAME_ORGANISATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomeaPackage.NAME_ORGANISATION_TYPE__KURZBEZEICHNUNG:
				setKurzbezeichnung(KURZBEZEICHNUNG_EDEFAULT);
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
			case DomeaPackage.NAME_ORGANISATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomeaPackage.NAME_ORGANISATION_TYPE__KURZBEZEICHNUNG:
				return KURZBEZEICHNUNG_EDEFAULT == null ? kurzbezeichnung != null : !KURZBEZEICHNUNG_EDEFAULT.equals(kurzbezeichnung);
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
		result.append(", kurzbezeichnung: ");
		result.append(kurzbezeichnung);
		result.append(')');
		return result.toString();
	}

} //NameOrganisationTypeImpl
