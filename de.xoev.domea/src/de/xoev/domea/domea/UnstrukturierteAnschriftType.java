/*
 */
package de.xoev.domea.domea;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unstrukturierte Anschrift Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Die unstrukturierte Anschrift dient der Übermittlung von Anschriften, die nicht der regulären Anschrift entsprechen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getTyp <em>Typ</em>}</li>
 *   <li>{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile1 <em>Zeile1</em>}</li>
 *   <li>{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile2 <em>Zeile2</em>}</li>
 *   <li>{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile3 <em>Zeile3</em>}</li>
 *   <li>{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile4 <em>Zeile4</em>}</li>
 *   <li>{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile5 <em>Zeile5</em>}</li>
 *   <li>{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile6 <em>Zeile6</em>}</li>
 *   <li>{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZusatz <em>Zusatz</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getUnstrukturierteAnschriftType()
 * @model extendedMetaData="name='UnstrukturierteAnschriftType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UnstrukturierteAnschriftType extends EObject {
	/**
	 * Returns the value of the '<em><b>Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Im Typ wird beschrieben, um welche Art der Anschrift es sich handelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typ</em>' containment reference.
	 * @see #setTyp(AnschriftstypCodeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getUnstrukturierteAnschriftType_Typ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Typ' namespace='##targetNamespace'"
	 * @generated
	 */
	AnschriftstypCodeType getTyp();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getTyp <em>Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' containment reference.
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(AnschriftstypCodeType value);

	/**
	 * Returns the value of the '<em><b>Zeile1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erste Zeile der unstrukturierten Anschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeile1</em>' attribute.
	 * @see #setZeile1(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getUnstrukturierteAnschriftType_Zeile1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Zeile1' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZeile1();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile1 <em>Zeile1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeile1</em>' attribute.
	 * @see #getZeile1()
	 * @generated
	 */
	void setZeile1(String value);

	/**
	 * Returns the value of the '<em><b>Zeile2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zweite Zeile der unstrukturierten Anschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeile2</em>' attribute.
	 * @see #setZeile2(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getUnstrukturierteAnschriftType_Zeile2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Zeile2' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZeile2();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile2 <em>Zeile2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeile2</em>' attribute.
	 * @see #getZeile2()
	 * @generated
	 */
	void setZeile2(String value);

	/**
	 * Returns the value of the '<em><b>Zeile3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dritte Zeile der unstrukturierten Anschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeile3</em>' attribute.
	 * @see #setZeile3(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getUnstrukturierteAnschriftType_Zeile3()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Zeile3' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZeile3();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile3 <em>Zeile3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeile3</em>' attribute.
	 * @see #getZeile3()
	 * @generated
	 */
	void setZeile3(String value);

	/**
	 * Returns the value of the '<em><b>Zeile4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vierte Zeile der unstrukturierten Anschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeile4</em>' attribute.
	 * @see #setZeile4(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getUnstrukturierteAnschriftType_Zeile4()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Zeile4' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZeile4();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile4 <em>Zeile4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeile4</em>' attribute.
	 * @see #getZeile4()
	 * @generated
	 */
	void setZeile4(String value);

	/**
	 * Returns the value of the '<em><b>Zeile5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fünfte Zeile der unstrukturierten Anschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeile5</em>' attribute.
	 * @see #setZeile5(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getUnstrukturierteAnschriftType_Zeile5()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Zeile5' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZeile5();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile5 <em>Zeile5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeile5</em>' attribute.
	 * @see #getZeile5()
	 * @generated
	 */
	void setZeile5(String value);

	/**
	 * Returns the value of the '<em><b>Zeile6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sechste Zeile der unstrukturierten Anschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeile6</em>' attribute.
	 * @see #setZeile6(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getUnstrukturierteAnschriftType_Zeile6()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Zeile6' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZeile6();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile6 <em>Zeile6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeile6</em>' attribute.
	 * @see #getZeile6()
	 * @generated
	 */
	void setZeile6(String value);

	/**
	 * Returns the value of the '<em><b>Zusatz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Anschriftenzusatz beinhaltet ggf. erforderliche weitere Präzisierungen zu einer Anschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusatz</em>' attribute.
	 * @see #setZusatz(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getUnstrukturierteAnschriftType_Zusatz()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Zusatz' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZusatz();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZusatz <em>Zusatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusatz</em>' attribute.
	 * @see #getZusatz()
	 * @generated
	 */
	void setZusatz(String value);

} // UnstrukturierteAnschriftType
