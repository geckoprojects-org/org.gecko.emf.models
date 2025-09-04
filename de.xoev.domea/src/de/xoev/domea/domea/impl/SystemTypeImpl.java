/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.SystemType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.SystemTypeImpl#getInstanzID <em>Instanz ID</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.SystemTypeImpl#getProduktname <em>Produktname</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.SystemTypeImpl#getProduktversion <em>Produktversion</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.SystemTypeImpl#getProdukthersteller <em>Produkthersteller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemTypeImpl extends MinimalEObjectImpl.Container implements SystemType {
	/**
	 * The default value of the '{@link #getInstanzID() <em>Instanz ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanzID()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANZ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanzID() <em>Instanz ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanzID()
	 * @generated
	 * @ordered
	 */
	protected String instanzID = INSTANZ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProduktname() <em>Produktname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduktname()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUKTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProduktname() <em>Produktname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduktname()
	 * @generated
	 * @ordered
	 */
	protected String produktname = PRODUKTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProduktversion() <em>Produktversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduktversion()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUKTVERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProduktversion() <em>Produktversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduktversion()
	 * @generated
	 * @ordered
	 */
	protected String produktversion = PRODUKTVERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProdukthersteller() <em>Produkthersteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdukthersteller()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUKTHERSTELLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProdukthersteller() <em>Produkthersteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdukthersteller()
	 * @generated
	 * @ordered
	 */
	protected String produkthersteller = PRODUKTHERSTELLER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.SYSTEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanzID() {
		return instanzID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanzID(String newInstanzID) {
		String oldInstanzID = instanzID;
		instanzID = newInstanzID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.SYSTEM_TYPE__INSTANZ_ID, oldInstanzID, instanzID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProduktname() {
		return produktname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduktname(String newProduktname) {
		String oldProduktname = produktname;
		produktname = newProduktname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.SYSTEM_TYPE__PRODUKTNAME, oldProduktname, produktname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProduktversion() {
		return produktversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduktversion(String newProduktversion) {
		String oldProduktversion = produktversion;
		produktversion = newProduktversion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.SYSTEM_TYPE__PRODUKTVERSION, oldProduktversion, produktversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProdukthersteller() {
		return produkthersteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdukthersteller(String newProdukthersteller) {
		String oldProdukthersteller = produkthersteller;
		produkthersteller = newProdukthersteller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.SYSTEM_TYPE__PRODUKTHERSTELLER, oldProdukthersteller, produkthersteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomeaPackage.SYSTEM_TYPE__INSTANZ_ID:
				return getInstanzID();
			case DomeaPackage.SYSTEM_TYPE__PRODUKTNAME:
				return getProduktname();
			case DomeaPackage.SYSTEM_TYPE__PRODUKTVERSION:
				return getProduktversion();
			case DomeaPackage.SYSTEM_TYPE__PRODUKTHERSTELLER:
				return getProdukthersteller();
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
			case DomeaPackage.SYSTEM_TYPE__INSTANZ_ID:
				setInstanzID((String)newValue);
				return;
			case DomeaPackage.SYSTEM_TYPE__PRODUKTNAME:
				setProduktname((String)newValue);
				return;
			case DomeaPackage.SYSTEM_TYPE__PRODUKTVERSION:
				setProduktversion((String)newValue);
				return;
			case DomeaPackage.SYSTEM_TYPE__PRODUKTHERSTELLER:
				setProdukthersteller((String)newValue);
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
			case DomeaPackage.SYSTEM_TYPE__INSTANZ_ID:
				setInstanzID(INSTANZ_ID_EDEFAULT);
				return;
			case DomeaPackage.SYSTEM_TYPE__PRODUKTNAME:
				setProduktname(PRODUKTNAME_EDEFAULT);
				return;
			case DomeaPackage.SYSTEM_TYPE__PRODUKTVERSION:
				setProduktversion(PRODUKTVERSION_EDEFAULT);
				return;
			case DomeaPackage.SYSTEM_TYPE__PRODUKTHERSTELLER:
				setProdukthersteller(PRODUKTHERSTELLER_EDEFAULT);
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
			case DomeaPackage.SYSTEM_TYPE__INSTANZ_ID:
				return INSTANZ_ID_EDEFAULT == null ? instanzID != null : !INSTANZ_ID_EDEFAULT.equals(instanzID);
			case DomeaPackage.SYSTEM_TYPE__PRODUKTNAME:
				return PRODUKTNAME_EDEFAULT == null ? produktname != null : !PRODUKTNAME_EDEFAULT.equals(produktname);
			case DomeaPackage.SYSTEM_TYPE__PRODUKTVERSION:
				return PRODUKTVERSION_EDEFAULT == null ? produktversion != null : !PRODUKTVERSION_EDEFAULT.equals(produktversion);
			case DomeaPackage.SYSTEM_TYPE__PRODUKTHERSTELLER:
				return PRODUKTHERSTELLER_EDEFAULT == null ? produkthersteller != null : !PRODUKTHERSTELLER_EDEFAULT.equals(produkthersteller);
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
		result.append(" (instanzID: ");
		result.append(instanzID);
		result.append(", produktname: ");
		result.append(produktname);
		result.append(", produktversion: ");
		result.append(produktversion);
		result.append(", produkthersteller: ");
		result.append(produkthersteller);
		result.append(')');
		return result.toString();
	}

} //SystemTypeImpl
