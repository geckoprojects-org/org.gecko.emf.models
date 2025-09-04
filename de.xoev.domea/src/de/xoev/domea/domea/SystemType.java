/*
 */
package de.xoev.domea.domea;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ein System ist ein die xdomea-Nachrichten erzeugendes Produkt (z. B. DMS / VBS).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.SystemType#getInstanzID <em>Instanz ID</em>}</li>
 *   <li>{@link de.xoev.domea.domea.SystemType#getProduktname <em>Produktname</em>}</li>
 *   <li>{@link de.xoev.domea.domea.SystemType#getProduktversion <em>Produktversion</em>}</li>
 *   <li>{@link de.xoev.domea.domea.SystemType#getProdukthersteller <em>Produkthersteller</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getSystemType()
 * @model extendedMetaData="name='SystemType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SystemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Instanz ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Instanz-ID dient der eindeutigen Identifikation des Systems, in dem die xdomea-Nachricht erzeugt wird. Die Identifizierung des Mandanten ist darin enthalten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instanz ID</em>' attribute.
	 * @see #setInstanzID(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getSystemType_InstanzID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='InstanzID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstanzID();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.SystemType#getInstanzID <em>Instanz ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instanz ID</em>' attribute.
	 * @see #getInstanzID()
	 * @generated
	 */
	void setInstanzID(String value);

	/**
	 * Returns the value of the '<em><b>Produktname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name des Produktes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produktname</em>' attribute.
	 * @see #setProduktname(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getSystemType_Produktname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Produktname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProduktname();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.SystemType#getProduktname <em>Produktname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produktname</em>' attribute.
	 * @see #getProduktname()
	 * @generated
	 */
	void setProduktname(String value);

	/**
	 * Returns the value of the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Version des Produktes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produktversion</em>' attribute.
	 * @see #setProduktversion(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getSystemType_Produktversion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Produktversion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProduktversion();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.SystemType#getProduktversion <em>Produktversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produktversion</em>' attribute.
	 * @see #getProduktversion()
	 * @generated
	 */
	void setProduktversion(String value);

	/**
	 * Returns the value of the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name der Organisation / Firma, die für das Produkt (die Software) verantwortlich ist, mit dem die Nachricht erstellt wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produkthersteller</em>' attribute.
	 * @see #setProdukthersteller(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getSystemType_Produkthersteller()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Produkthersteller' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProdukthersteller();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.SystemType#getProdukthersteller <em>Produkthersteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produkthersteller</em>' attribute.
	 * @see #getProdukthersteller()
	 * @generated
	 */
	void setProdukthersteller(String value);

} // SystemType
